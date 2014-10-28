package com.triers.dsl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import twitter4j.User;

import com.triers.dsl.TwitterParser.AllContext;
import com.triers.dsl.TwitterParser.AmbContext;
import com.triers.dsl.TwitterParser.AmbulanceContext;
import com.triers.dsl.TwitterParser.ArgContext;
import com.triers.dsl.TwitterParser.CompContext;
import com.triers.dsl.TwitterParser.DocContext;
import com.triers.dsl.TwitterParser.DocsContext;
import com.triers.dsl.TwitterParser.LocContext;
import com.triers.dsl.TwitterParser.ProgramContext;
import com.triers.utils.DBConnection;

public class MyTwitterListener implements TwitterListener{
	
	 public Stack<Integer>       stack = new Stack<Integer>();
	  public Map<String, Integer> sym   = new HashMap<String, Integer>();

	 

	  public void exitPoints(TwitterParser.DocsContext ctx)
	  {
	    //sym.put(ctx.INT().getText(), stack.pop());
	 
	 
	 
	  }



	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void enterArg(ArgContext ctx) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void exitArg(ArgContext ctx) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void enterComp(CompContext ctx) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void exitComp(CompContext ctx) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void enterDocs(DocsContext ctx) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void exitDocs(DocsContext ctx) {
		// TODO Auto-generated method stub
		 System.out.println("Entity="+ctx.doc().getText());
		 System.out.println("Field to be compared"+ctx.ID().getText());
		 System.out.println("sign="+ctx.SIGN().getText());
		 System.out.println("Value"+ctx.comp().getText());
		 
		 System.out.println("select name from "+ctx.doc().getText()+" where time "+ctx.SIGN().getText()+""+ctx.comp().getText()+" and speciality='"+ctx.ID().getText()+"'");
		String query="select name,speciality from "+ctx.doc().getText()+" where time "+ctx.SIGN().getText()+""+ctx.comp().getText()+" and speciality='"+ctx.ID().getText()+"'";
		try {
			Connection con=DBConnection.connect();
			Statement stmt = null;
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

		      //STEP 5: Extract data from result set
		      while(rs.next()){
		    	  //int id  = rs.getInt("doctorID");
		          String name = rs.getString(1);
		          String speciality = rs.getString(2);
		          
		          System.out.println("name="+name+" speciality="+speciality);
		          User user=TestCommands.getUser();
		          DBConnection.twitter.sendDirectMessage(user.getId(),"name="+name+" speciality="+speciality );
		      }
		      rs.close();
		      stmt.close();
		      con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



	@Override
	public void enterProgram(ProgramContext ctx) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void exitProgram(ProgramContext ctx) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void enterAmb(AmbContext ctx) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void exitAmb(AmbContext ctx) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void enterDoc(DocContext ctx) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void exitDoc(DocContext ctx) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void enterLoc(LocContext ctx) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void exitLoc(LocContext ctx) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void enterAll(AllContext ctx) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void exitAll(AllContext ctx) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void enterAmbulance(AmbulanceContext ctx) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void exitAmbulance(AmbulanceContext ctx) {
		// TODO Auto-generated method stub
		
		 
		 System.out.println("Select "+ctx.amb().getText()+" from ambulance where "+ctx.ID().getText()+"='"+ctx.loc().getText()+"'");
		
	}

}
