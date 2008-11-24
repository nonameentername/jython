// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.AstAdapter;
import org.python.antlr.PythonTree;
import org.python.antlr.ListWrapper;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class TryExcept extends stmtType {
    private ListWrapper<stmtType> body;
    public ListWrapper<stmtType> getInternalBody() {
        return body;
    }
    public Object getBody() {
        return body;
    }
    public void setBody(Object body) {
        this.body = new ListWrapper<stmtType>(
            (java.util.List<stmtType>)body);
    }

    private ListWrapper<excepthandlerType> handlers;
    public ListWrapper<excepthandlerType> getInternalHandlers() {
        return handlers;
    }
    public Object getHandlers() {
        return handlers;
    }
    public void setHandlers(Object handlers) {
        this.handlers = new ListWrapper<excepthandlerType>(
            (java.util.List<excepthandlerType>)handlers);
    }

    private ListWrapper<stmtType> orelse;
    public ListWrapper<stmtType> getInternalOrelse() {
        return orelse;
    }
    public Object getOrelse() {
        return orelse;
    }
    public void setOrelse(Object orelse) {
        this.orelse = new ListWrapper<stmtType>(
            (java.util.List<stmtType>)orelse);
    }


    private final static String[] fields = new String[] {"body", "handlers",
                                                          "orelse"};
    public String[] get_fields() { return fields; }

    public TryExcept() {}
    public TryExcept(Object body, Object handlers, Object orelse) {
        setBody(body);
        setHandlers(handlers);
        setOrelse(orelse);
    }

    public TryExcept(Token token, java.util.List<stmtType> body,
    java.util.List<excepthandlerType> handlers, java.util.List<stmtType>
    orelse) {
        super(token);
        this.body = new ListWrapper<stmtType>(body);
        if (body != null) {
            for(PythonTree t : body) {
                addChild(t);
            }
        }
        this.handlers = new ListWrapper<excepthandlerType>(handlers);
        if (handlers != null) {
            for(PythonTree t : handlers) {
                addChild(t);
            }
        }
        this.orelse = new ListWrapper<stmtType>(orelse);
        if (orelse != null) {
            for(PythonTree t : orelse) {
                addChild(t);
            }
        }
    }

    public TryExcept(Integer ttype, Token token, java.util.List<stmtType> body,
    java.util.List<excepthandlerType> handlers, java.util.List<stmtType>
    orelse) {
        super(ttype, token);
        this.body = new ListWrapper<stmtType>(body);
        if (body != null) {
            for(PythonTree t : body) {
                addChild(t);
            }
        }
        this.handlers = new ListWrapper<excepthandlerType>(handlers);
        if (handlers != null) {
            for(PythonTree t : handlers) {
                addChild(t);
            }
        }
        this.orelse = new ListWrapper<stmtType>(orelse);
        if (orelse != null) {
            for(PythonTree t : orelse) {
                addChild(t);
            }
        }
    }

    public TryExcept(PythonTree tree, java.util.List<stmtType> body,
    java.util.List<excepthandlerType> handlers, java.util.List<stmtType>
    orelse) {
        super(tree);
        this.body = new ListWrapper<stmtType>(body);
        if (body != null) {
            for(PythonTree t : body) {
                addChild(t);
            }
        }
        this.handlers = new ListWrapper<excepthandlerType>(handlers);
        if (handlers != null) {
            for(PythonTree t : handlers) {
                addChild(t);
            }
        }
        this.orelse = new ListWrapper<stmtType>(orelse);
        if (orelse != null) {
            for(PythonTree t : orelse) {
                addChild(t);
            }
        }
    }

    public String toString() {
        return "TryExcept";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("TryExcept(");
        sb.append("body=");
        sb.append(dumpThis(body));
        sb.append(",");
        sb.append("handlers=");
        sb.append(dumpThis(handlers));
        sb.append(",");
        sb.append("orelse=");
        sb.append(dumpThis(orelse));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitTryExcept(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (body != null) {
            for (PythonTree t : body) {
                if (t != null)
                    t.accept(visitor);
            }
        }
        if (handlers != null) {
            for (PythonTree t : handlers) {
                if (t != null)
                    t.accept(visitor);
            }
        }
        if (orelse != null) {
            for (PythonTree t : orelse) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

    private int lineno = -1;
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

    public void setCol_offset(int num) {
        col_offset = num;
    }

}
