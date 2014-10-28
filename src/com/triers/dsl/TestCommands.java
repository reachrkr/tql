package com.triers.dsl;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import twitter4j.User;

public class TestCommands {
	private static final ThreadLocal<User> context = new ThreadLocal<User>();
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("code.txt"));
		TwitterLexer lexer=new TwitterLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		TwitterParser parser=new TwitterParser(tokens);
		parser.setBuildParseTree(true);
		parser.addParseListener(new MyTwitterListener());
		ParseTree tree = parser.program(); // begin parsing at init rule

		System.out.println(tree.toStringTree(parser)); // print LISP-style tree

	}
	public static User getUser()
	{
		return context.get();
	}
	public static void parser(String tweet,User user) throws Exception
	{
		context.set(user);
		InputStream stream = new ByteArrayInputStream(tweet.getBytes(StandardCharsets.UTF_8));
		ANTLRInputStream input = new ANTLRInputStream(stream);
		TwitterLexer lexer=new TwitterLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		TwitterParser parser=new TwitterParser(tokens);
		parser.setBuildParseTree(true);
		parser.addParseListener(new MyTwitterListener());
		ParseTree tree = parser.program(); // begin parsing at init rule
		
	}

}
