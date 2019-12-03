// Generated from C:/Users/graha/Development/Electrical_Device_Signatures/Grammars\ElecDevSig.g4 by ANTLR 4.7.2
package org.ladbury.eds.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ElecDevSigParser}.
 */
public interface ElecDevSigListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ElecDevSigParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(ElecDevSigParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(ElecDevSigParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElecDevSigParser#startdate}.
	 * @param ctx the parse tree
	 */
	void enterStartdate(ElecDevSigParser.StartdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#startdate}.
	 * @param ctx the parse tree
	 */
	void exitStartdate(ElecDevSigParser.StartdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElecDevSigParser#timebase}.
	 * @param ctx the parse tree
	 */
	void enterTimebase(ElecDevSigParser.TimebaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#timebase}.
	 * @param ctx the parse tree
	 */
	void exitTimebase(ElecDevSigParser.TimebaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElecDevSigParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(ElecDevSigParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(ElecDevSigParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElecDevSigParser#year}.
	 * @param ctx the parse tree
	 */
	void enterYear(ElecDevSigParser.YearContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#year}.
	 * @param ctx the parse tree
	 */
	void exitYear(ElecDevSigParser.YearContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElecDevSigParser#day_of_month}.
	 * @param ctx the parse tree
	 */
	void enterDay_of_month(ElecDevSigParser.Day_of_monthContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#day_of_month}.
	 * @param ctx the parse tree
	 */
	void exitDay_of_month(ElecDevSigParser.Day_of_monthContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElecDevSigParser#time_of_day}.
	 * @param ctx the parse tree
	 */
	void enterTime_of_day(ElecDevSigParser.Time_of_dayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#time_of_day}.
	 * @param ctx the parse tree
	 */
	void exitTime_of_day(ElecDevSigParser.Time_of_dayContext ctx);
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
	 * Enter a parse tree produced by {@link ElecDevSigParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ElecDevSigParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ElecDevSigParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElecDevSigParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(ElecDevSigParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(ElecDevSigParser.IntegerContext ctx);
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
	 * Enter a parse tree produced by {@link ElecDevSigParser#power_range}.
	 * @param ctx the parse tree
	 */
	void enterPower_range(ElecDevSigParser.Power_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#power_range}.
	 * @param ctx the parse tree
	 */
	void exitPower_range(ElecDevSigParser.Power_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElecDevSigParser#shape}.
	 * @param ctx the parse tree
	 */
	void enterShape(ElecDevSigParser.ShapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#shape}.
	 * @param ctx the parse tree
	 */
	void exitShape(ElecDevSigParser.ShapeContext ctx);
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
	 * Enter a parse tree produced by {@link ElecDevSigParser#time_interval}.
	 * @param ctx the parse tree
	 */
	void enterTime_interval(ElecDevSigParser.Time_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElecDevSigParser#time_interval}.
	 * @param ctx the parse tree
	 */
	void exitTime_interval(ElecDevSigParser.Time_intervalContext ctx);
}