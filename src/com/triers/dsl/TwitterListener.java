// Generated from Twitter.g4 by ANTLR 4.4
package com.triers.dsl;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TwitterParser}.
 */
public interface TwitterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TwitterParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(@NotNull TwitterParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TwitterParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(@NotNull TwitterParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TwitterParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(@NotNull TwitterParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link TwitterParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(@NotNull TwitterParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ambulance}
	 * labeled alternative in {@link TwitterParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAmbulance(@NotNull TwitterParser.AmbulanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ambulance}
	 * labeled alternative in {@link TwitterParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAmbulance(@NotNull TwitterParser.AmbulanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code docs}
	 * labeled alternative in {@link TwitterParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDocs(@NotNull TwitterParser.DocsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code docs}
	 * labeled alternative in {@link TwitterParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDocs(@NotNull TwitterParser.DocsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TwitterParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull TwitterParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TwitterParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull TwitterParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TwitterParser#amb}.
	 * @param ctx the parse tree
	 */
	void enterAmb(@NotNull TwitterParser.AmbContext ctx);
	/**
	 * Exit a parse tree produced by {@link TwitterParser#amb}.
	 * @param ctx the parse tree
	 */
	void exitAmb(@NotNull TwitterParser.AmbContext ctx);
	/**
	 * Enter a parse tree produced by {@link TwitterParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(@NotNull TwitterParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link TwitterParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(@NotNull TwitterParser.DocContext ctx);
	/**
	 * Enter a parse tree produced by {@link TwitterParser#loc}.
	 * @param ctx the parse tree
	 */
	void enterLoc(@NotNull TwitterParser.LocContext ctx);
	/**
	 * Exit a parse tree produced by {@link TwitterParser#loc}.
	 * @param ctx the parse tree
	 */
	void exitLoc(@NotNull TwitterParser.LocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code all}
	 * labeled alternative in {@link TwitterParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAll(@NotNull TwitterParser.AllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code all}
	 * labeled alternative in {@link TwitterParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAll(@NotNull TwitterParser.AllContext ctx);
}