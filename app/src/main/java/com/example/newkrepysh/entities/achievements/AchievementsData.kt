package com.example.newkrepysh.entities.achievements

import com.example.example.*
import com.google.gson.annotations.SerializedName

data class AchievementsData(
    @SerializedName("BackFlip"       ) var BackFlip       : BackFlip?       = BackFlip(),
    @SerializedName("Birch"          ) var Birch          : Birch?          = Birch(),
    @SerializedName("CornerBars"     ) var CornerBars     : CornerBars?     = CornerBars(),
    @SerializedName("ForwardRoll"    ) var ForwardRoll    : ForwardRoll?    = ForwardRoll(),
    @SerializedName("FrontFlip"      ) var FrontFlip      : FrontFlip?      = FrontFlip(),
    @SerializedName("JackieChan"     ) var JackieChan     : JackieChan?     = JackieChan(),
    @SerializedName("RollBack"       ) var RollBack       : RollBack?       = RollBack(),
    @SerializedName("SelfInsurance"  ) var SelfInsurance  : SelfInsurance?  = SelfInsurance(),
    @SerializedName("Somersault"     ) var Somersault     : Somersault?     = Somersault(),
    @SerializedName("WalkingOnHands" ) var WalkingOnHands : WalkingOnHands? = WalkingOnHands(),
    @SerializedName("Wheel"          ) var Wheel          : Wheel?          = Wheel()
)
