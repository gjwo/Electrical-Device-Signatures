# Electrical-Device-Signatures
This is about representing electrical devices' energy signatures using a grammar based approach supported by the ANTLR4 toolset.
This is my first attempt to use ANTLR, and so far I am very impressed with it, the IntelliJ Idea plugin is excellent.
I have produced a grammar in .g4 format which can be used to represent the energy fingerprint of devices. for example:
  (LEDBulb11w: [11W for var])
This would be a lightbulb which uses 11 watts for a variable amount of time. However many devices can be more complicated than that
for example a washing machine, which has several component devices represented by :
  (WashingMachine:
    (Valve:[2W for 20mS]) ->
    (Pump:[100W for (10s to 2M)]) ->
    (Heater:[1kW for (2M to 10M)]) ->
    (Motor:[500W, -200W for (5M to 20M)])
  )
Each component has a name, a consumption (real and optionally reactive), and a range of durations it can be on for.

Having got the basic grammar mechanism working, my initial goal is to refine the grammar and use it to reproduce an energy signature.
Later this may help with disaggregation.
