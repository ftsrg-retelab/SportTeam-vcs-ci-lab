package hu.bme.mit.train.controller;

import org.junit.jupiter.api.Test;

class Teszttrainsensor {

	@Test
	void test() {
		TrainControllerImpl asd = new TrainControllerImpl();
		asd.followSpeed();
		assert(asd.getReferenceSpeed() > 0);

	}

}
