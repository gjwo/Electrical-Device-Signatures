package org.ladbury.eds;

import org.ladbury.eds.gen.ElecDevSigBaseListener;
import org.ladbury.eds.gen.ElecDevSigParser;

public class ElecDevSig extends ElecDevSigBaseListener
{
    //override interfaces as required
    @Override public void enterInit(ElecDevSigParser.InitContext ctx) {
        System.out.print("Enter init ");
        System.out.println(ctx.toString());
    }

    @Override public void exitInit(ElecDevSigParser.InitContext ctx) {
        System.out.print("Exit init ");
        System.out.println(ctx.toString());
    }
    @Override public void enterDevice_signature(ElecDevSigParser.Device_signatureContext ctx) {
        System.out.print("Enter Device ");
        System.out.println(ctx.toStringTree());
    }
    @Override public void enterStartdate(ElecDevSigParser.StartdateContext ctx) {
        System.out.print("Enter Startdate ");
        System.out.println(ctx.toStringTree());
    }
    @Override public void enterTimebase(ElecDevSigParser.TimebaseContext ctx) {
        System.out.print("Enter Timebase ");
        System.out.println(ctx.toStringTree());
    }

//    @Override public void exitDevice_signature(ElecDevSigParser.Device_signatureContext ctx) {
//        System.out.println("Exit Device ");
//        System.out.println(ctx.toStringTree());
//    }
}
