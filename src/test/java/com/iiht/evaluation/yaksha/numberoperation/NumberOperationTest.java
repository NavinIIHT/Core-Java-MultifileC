package com.iiht.evaluation.yaksha.numberoperation;

import static com.iiht.evaluation.yaksha.testutils.TestUtils.boundaryTestFile;
import static com.iiht.evaluation.yaksha.testutils.TestUtils.businessTestFile;
import static com.iiht.evaluation.yaksha.testutils.TestUtils.currentTest;
import static com.iiht.evaluation.yaksha.testutils.TestUtils.testReport;
import static com.iiht.evaluation.yaksha.testutils.TestUtils.yakshaAssert;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class NumberOperationTest {

	@AfterAll
	public static void afterAll() {
		testReport();
	}

	@Test
	public void testGetOperationCountForEvenNo() throws Exception {
		NumberOperation numberOperation = new NumberOperation();
		int inputNo = 5;
		Integer count = numberOperation.getOperationCount(inputNo);
		if (count == null) {
			yakshaAssert(currentTest(), "false", businessTestFile);
			return;
		}
		yakshaAssert(currentTest(), count == 5 ? "true" : "false", businessTestFile);
	}

	@Test
	public void testGetOperationCountForOddNo() throws Exception {
		NumberOperation numberOperation = new NumberOperation();
		int inputNo = 6;
		Integer count = numberOperation.getOperationCount(inputNo);
		if (count == null) {
			yakshaAssert(currentTest(), "false", businessTestFile);
			return;
		}
		yakshaAssert(currentTest(), count == 4 ? "true" : "false", businessTestFile);
	}

	@Test
	public void testGetOperationCountForOutOfRange() throws Exception {
		NumberOperation numberOperation = new NumberOperation();
		int inputNo = -6;
		Integer count = numberOperation.getOperationCount(inputNo);
		if (count == null) {
			yakshaAssert(currentTest(), "false", boundaryTestFile);
			return;
		}
		yakshaAssert(currentTest(), count == 0 ? "true" : "false", boundaryTestFile);
	}

	@Test
	public void testGetOperationCountForOne() throws Exception {
		NumberOperation numberOperation = new NumberOperation();
		int inputNo = 1;
		Integer count = numberOperation.getOperationCount(inputNo);
		if (count == null) {
			yakshaAssert(currentTest(), "false", boundaryTestFile);
			return;
		}
		yakshaAssert(currentTest(), count == 0 ? "true" : "false", boundaryTestFile);
	}

	@Test
	public void testGetOperationCountForZero() throws Exception {
		NumberOperation numberOperation = new NumberOperation();
		int inputNo = 0;
		Integer count = numberOperation.getOperationCount(inputNo);
		if (count == null) {
			yakshaAssert(currentTest(), "false", boundaryTestFile);
			return;
		}
		yakshaAssert(currentTest(), count == 0 ? "true" : "false", boundaryTestFile);
	}

}
