package org.firstinspires.ftc.teamcode.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.misc.Alliance;
import org.firstinspires.ftc.teamcode.misc.BalancingStonePosition;

@Autonomous(name="Autonomous RED (far)", group="Tests")
public class AutonomousRedFar extends AutonomousOperation {
    public Alliance getAlliance() {
        return Alliance.RED;
    }

    public BalancingStonePosition getBalancingStonePosition() {
        return BalancingStonePosition.FAR;
    }
}