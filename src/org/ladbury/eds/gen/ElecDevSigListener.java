// Generated from C:/Users/graha/Development/Electrical_Device_Signatures/Grammars\ElecDevSig.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ElecDevSigParser}.
 */
public interface ElecDevSigListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ElecDevSigParser#signatures}.
	 * @param ctx the parse tree
	 */
	void enterSignatures(ElecDevSigParser.SignaturesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#signatures}.
	 * @param ctx the parse tree
	 */
	void exitSignatures(ElecDevSigParser.SignaturesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElecDevSigParser#device_signature}.
	 * @param ctx the parse tree
	 */
	void enterDevice_signature(ElecDevSigParser.Device_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#device_signature}.
	 * @param ctx the parse tree
	 */
	void exitDevice_signature(ElecDevSigParser.Device_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElecDevSigParser#energy_signature}.
	 * @param ctx the parse tree
	 */
	void enterEnergy_signature(ElecDevSigParser.Energy_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#energy_signature}.
	 * @param ctx the parse tree
	 */
	void exitEnergy_signature(ElecDevSigParser.Energy_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElecDevSigParser#consumption_block}.
	 * @param ctx the parse tree
	 */
	void enterConsumption_block(ElecDevSigParser.Consumption_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#consumption_block}.
	 * @param ctx the parse tree
	 */
	void exitConsumption_block(ElecDevSigParser.Consumption_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElecDevSigParser#real_power}.
	 * @param ctx the parse tree
	 */
	void enterReal_power(ElecDevSigParser.Real_powerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#real_power}.
	 * @param ctx the parse tree
	 */
	void exitReal_power(ElecDevSigParser.Real_powerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElecDevSigParser#reactive_power}.
	 * @param ctx the parse tree
	 */
	void enterReactive_power(ElecDevSigParser.Reactive_powerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#reactive_power}.
	 * @param ctx the parse tree
	 */
	void exitReactive_power(ElecDevSigParser.Reactive_powerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElecDevSigParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(ElecDevSigParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(ElecDevSigParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElecDevSigParser#time_period}.
	 * @param ctx the parse tree
	 */
	void enterTime_period(ElecDevSigParser.Time_periodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#time_period}.
	 * @param ctx the parse tree
	 */
	void exitTime_period(ElecDevSigParser.Time_periodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElecDevSigParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(ElecDevSigParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(ElecDevSigParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElecDevSigParser#min_time}.
	 * @param ctx the parse tree
	 */
	void enterMin_time(ElecDevSigParser.Min_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#min_time}.
	 * @param ctx the parse tree
	 */
	void exitMin_time(ElecDevSigParser.Min_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElecDevSigParser#max_time}.
	 * @param ctx the parse tree
	 */
	void enterMax_time(ElecDevSigParser.Max_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#max_time}.
	 * @param ctx the parse tree
	 */
	void exitMax_time(ElecDevSigParser.Max_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElecDevSigParser#elapsed_time}.
	 * @param ctx the parse tree
	 */
	void enterElapsed_time(ElecDevSigParser.Elapsed_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#elapsed_time}.
	 * @param ctx the parse tree
	 */
	void exitElapsed_time(ElecDevSigParser.Elapsed_timeContext ctx);
}