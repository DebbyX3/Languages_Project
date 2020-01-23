import value.*;

import java.util.Random;

public class IntImp extends ImpBaseVisitor<Value> {

    private final Conf conf;

    public IntImp(Conf conf) {
        this.conf = conf;
    }

    private ComValue visitCom(ImpParser.ComContext ctx) {
        return (ComValue) visit(ctx);
    }

    @Override
    public ComValue visitAssignCom(ImpParser.AssignComContext ctx)
    {
        visitChildren(ctx);

        return ComValue.INSTANCE;
    }

    private ExpValue<?> visitExp(ImpParser.ExpContext ctx) {
        return (ExpValue<?>) visit(ctx);
    }

    private AssignmentValue visitAssignment(ImpParser.AssignmentContext ctx) {
        return (AssignmentValue) visit(ctx);
    }

    private ComValue visitIfThen(ImpParser.IfThenContext ctx) {
        return (ComValue) visit(ctx);
    }

    private ComValue visitElseIf(ImpParser.ElseIfContext ctx) {
        return (ComValue) visit(ctx);
    }

    private ComValue visitElsee(ImpParser.ElseeContext ctx) {
        return (ComValue) visit(ctx);
    }

    private int visitNatExp(ImpParser.ExpContext ctx) {
        try {
            return ((NaturalValue) visit(ctx)).toJavaValue();
        }
        catch(ClassCastException e) {
            System.err.println("Type mismatch in the expression:");
            System.err.println();
            System.err.println(ctx.getText());
            System.err.println();
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getStartIndex());
            System.err.println("> Numerical expression expected");

            System.exit(1);
        }

        return 0; // dumb return (non-reachable code)
    }

    private boolean visitBoolExp(ImpParser.ExpContext ctx) {
        try {
            return ((BooleanValue) visit(ctx)).toJavaValue();
        }
        catch(ClassCastException e) {
            System.err.println("Type mismatch:");
            System.err.println(">>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println("> Boolean expression expected");

            System.exit(1);
        }

        return false; // dumb return (non-reachable code)
    }

    // -------------- IF THEN ELSEIF ELSE STATEMENT --------------

    // grammar: IF LPAR exp RPAR THEN LBRACE com RBRACE
    @Override
    public Value visitIfThenStatement(ImpParser.IfThenStatementContext ctx) {
        if (visitBoolExp(ctx.exp()))                // check condition
            return visitCom(ctx.com());             // visit command if exp is true
        return null;
    }

    // grammar: ifThen
    @Override
    public Value visitIfThenStatementRecall(ImpParser.IfThenStatementRecallContext ctx) {
        return visitIfThen(ctx.ifThen());           // visit visitIfThenStatement
    }

    // grammar: ifThen elseIf
    @Override
    public Value visitIfThenStatementPlusElseIfStatement(ImpParser.IfThenStatementPlusElseIfStatementContext ctx) {
        //ifThen elseIf
        if (visitIfThen(ctx.ifThen()) == null)      // use visitIfThenStatement to check if the com has to be executed
            return visitElseIf(ctx.elseIf());       // visit visitElseIfStatement if prev condition is true
                                                    // (visit it if visitIfThenStatement returns null.
                                                    // In other words, if the exp is false, do the elseif)
        return null;
    }

    // grammar: ifThen elsee
    @Override
    public Value visitIfThenStatementPlusElseStatement(ImpParser.IfThenStatementPlusElseStatementContext ctx) {
        if (visitIfThen(ctx.ifThen()) == null)      // use visitIfThenStatement to check if the com has to be executed
            return visitElsee(ctx.elsee());         // visit visitElseStatement if prev condition is true
                                                    // (visit it if visitIfThenStatement returns null.
                                                    // In other words, if the exp is false, do the else)

        return null;
    }

    // grammar: ELSEIF LPAR exp RPAR LBRACE com RBRACE elsee
    @Override
    public Value visitElseIfStatement(ImpParser.ElseIfStatementContext ctx) {
        if (visitBoolExp(ctx.exp()))                // check condition
             return visitCom(ctx.com());            // visit command if exp is true
        return visitElsee(ctx.elsee());             // if it's false then exec the else, calling visitElseStatement
    }

    // grammar: elseIf
    @Override
    public Value visitElseIfStatementRecall(ImpParser.ElseIfStatementRecallContext ctx) {
        return visitElseIf(ctx.elseIf());           // call visitElseStatement
    }

    // grammar: ELSE LBRACE com RBRACE
    @Override
    public Value visitElseStatement(ImpParser.ElseStatementContext ctx) {
        return visitCom(ctx.com());                 // call visitCom
    }

    // grammar: epsilon
    @Override
    public Value visitEmptyStatement(ImpParser.EmptyStatementContext ctx) {
        return null;
    }

    @Override
    public Value visitIfCom(ImpParser.IfComContext ctx) {
        return super.visitIfCom(ctx);
    }

    // -------------- END IF THEN ELSEIF ELSE STATEMENT --------------

    @Override
    public AssignmentValue visitAssign(ImpParser.AssignContext ctx) {
        conf.put(ctx.ID().getText(), visitExp(ctx.exp()));
        return AssignmentValue.INSTANCE;
    }

    @Override
    public ComValue visitSkip(ImpParser.SkipContext ctx) {
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitSeq(ImpParser.SeqContext ctx) {
        visitCom(ctx.com(0));
        visitCom(ctx.com(1));
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitWhile(ImpParser.WhileContext ctx) {
        if (!visitBoolExp(ctx.exp()))
            return ComValue.INSTANCE;

        visitCom(ctx.com()); //stampa
        return visitCom(ctx);
    }

    @Override
    public ComValue visitOut(ImpParser.OutContext ctx) {
        System.out.println(visitExp(ctx.exp()));
        return ComValue.INSTANCE;
    }

    // ------------------- FOR -------------------
    @Override
    public ComValue visitFor(ImpParser.ForContext ctx) {

        visitAssignment(ctx.assignment());
        return visitForSupport(ctx); // we call this recursive method to not re-call the first assignment (prev instruction)
    }

    private ComValue visitForSupport(ImpParser.ForContext ctx)
    {
        if (!visitBoolExp(ctx.exp()))
            return ComValue.INSTANCE;
        visitCom(ctx.com(1));
        visitCom(ctx.com(0)); //stampa
        return visitForSupport(ctx);    // recursive call
    }

    // ------------------- END FOR -------------------

    // ------------------- DO WHILE -------------------

    @Override
    public ComValue visitDoWhile(ImpParser.DoWhileContext ctx) {
        visitCom(ctx.com());
        return visitDoWhileSupport(ctx); // we call this recursive method to not re-call the first command (prev instruction)
    }

    private ComValue visitDoWhileSupport(ImpParser.DoWhileContext ctx)
    {
        if (!visitBoolExp(ctx.exp()))
            return ComValue.INSTANCE;

        visitCom(ctx.com());
        return visitDoWhileSupport(ctx);    // recursive call
    }

    // ------------------- END DO WHILE -------------------

    @Override
    public ComValue visitNd(ImpParser.NdContext ctx) {
        Random r = new Random();
        return r.nextInt(2) == 0 ? visitCom(ctx.com(0)) : visitCom(ctx.com(1));
    }

    @Override
    public NaturalValue visitNat(ImpParser.NatContext ctx) {
        return new NaturalValue(Integer.parseInt(ctx.NAT().getText()));
    }

    @Override
    public BooleanValue visitBool(ImpParser.BoolContext ctx) {
        return new BooleanValue(Boolean.parseBoolean(ctx.BOOL().getText()));
    }

    @Override
    public ExpValue<?> visitParExp(ImpParser.ParExpContext ctx) {
        return visitExp(ctx.exp());
    }

    @Override
    public ExpValue<?> visitNot(ImpParser.NotContext ctx) {
        return new BooleanValue(!visitBoolExp(ctx.exp()));
    }

    @Override
    public NaturalValue visitPow(ImpParser.PowContext ctx) {
        int base = visitNatExp(ctx.exp(0));
        int exp = visitNatExp(ctx.exp(1));

        return new NaturalValue((int) Math.pow(base, exp));
    }

    @Override
    public NaturalValue visitDivMulMod(ImpParser.DivMulModContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        switch (ctx.op.getType()) {
            case ImpParser.DIV : return new NaturalValue(left / right);
            case ImpParser.MUL : return new NaturalValue(left * right);
            case ImpParser.MOD : return new NaturalValue(left % right);
        }

        return null; // dumb return (non-reachable code)
    }

    @Override
    public NaturalValue visitPlusMinus(ImpParser.PlusMinusContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        switch (ctx.op.getType()) {
            case ImpParser.PLUS  : return new NaturalValue(left + right);
            case ImpParser.MINUS : return new NaturalValue(Math.max(left - right, 0));
        }

        return null; // dumb return (non-reachable code)
    }

    @Override
    public BooleanValue visitCmpExp(ImpParser.CmpExpContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        switch (ctx.op.getType()) {
            case ImpParser.GEQ : return new BooleanValue(left >= right);
            case ImpParser.LEQ : return new BooleanValue(left <= right);
            case ImpParser.LT  : return new BooleanValue(left < right);
            case ImpParser.GT  : return new BooleanValue(left > right);
        }

        return null; // dumb return (non-reachable code)
    }

    @Override
    public BooleanValue visitEqExp(ImpParser.EqExpContext ctx) {
        ExpValue<?> left = visitExp(ctx.exp(0));
        ExpValue<?> right = visitExp(ctx.exp(1));

        switch (ctx.op.getType()) {
            case ImpParser.EQQ : return new BooleanValue(left.equals(right));
            case ImpParser.NEQ : return new BooleanValue(!left.equals(right));
        }

        return null; // dumb return (non-reachable code)
    }

    @Override
    public BooleanValue visitLogicExp(ImpParser.LogicExpContext ctx) {
        boolean left = visitBoolExp(ctx.exp(0));
        boolean right = visitBoolExp(ctx.exp(1));

        switch (ctx.op.getType()) {
            case ImpParser.AND : return new BooleanValue(left && right);
            case ImpParser.OR  : return new BooleanValue(left || right);
        }

        return null; // dumb return (non-reachable code)
    }

    @Override
    public ExpValue<?> visitId(ImpParser.IdContext ctx) {
        if (conf.get(ctx.ID().getText()) == null) {
            System.err.println("Variable '" + ctx.ID().getText() + "' used but never declared");
            System.exit(1);
        }

        return conf.get(ctx.ID().getText());
    }
}
