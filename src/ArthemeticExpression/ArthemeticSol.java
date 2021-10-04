package ArthemeticExpression;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ArthemeticSol {

	public static void main(String[] args) throws ScriptException {
		 ScriptEngineManager mgr = new ScriptEngineManager();
		    ScriptEngine engine = mgr.getEngineByName("JavaScript");
		    String foo = "40+2";
		    String f1="3+2+10/2*4-2";
		    String f2="3+2*6+6-7";
		    System.out.println(engine.eval(foo));
		    System.out.println(engine.eval(f1));
		    System.out.println(engine.eval(f2));
		    } 

	}


