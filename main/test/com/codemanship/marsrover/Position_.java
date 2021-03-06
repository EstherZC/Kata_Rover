package com.codemanship.marsrover;

import org.junit.Test;
import refactoring.SimpleViewPoint;
import refactoring.SimpleViewPoint.Position;

import static org.junit.Assert.assertEquals;
import static refactoring.SimpleViewPoint.Heading.*;

public class Position_ {

	@Test
	public void should_calculate_forward_position() {
		assertEquals(new Position(-1,0), new Position(0,0).forward(North).forward(West).forward(South));
	}
}
