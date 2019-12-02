package org.ladbury.eds.gen;// Generated from C:/Users/graha/Development/Electrical_Device_Signatures/Grammars\ElecDevSig.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ElecDevSigParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ElecDevSigVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ElecDevSigParser#signatures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignatures(ElecDevSigParser.SignaturesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElecDevSigParser#device_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDevice_signature(ElecDevSigParser.Device_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElecDevSigParser#energy_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnergy_signature(ElecDevSigParser.Energy_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElecDevSigParser#consumption_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsumption_block(ElecDevSigParser.Consumption_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElecDevSigParser#real_power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_power(ElecDevSigParser.Real_powerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElecDevSigParser#reactive_power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactive_power(ElecDevSigParser.Reactive_powerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElecDevSigParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(ElecDevSigParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElecDevSigParser#time_period}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_period(ElecDevSigParser.Time_periodContext ctx);
}