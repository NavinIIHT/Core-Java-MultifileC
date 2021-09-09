package com.iiht.evaluation.yaksha.hcf;

import static com.iiht.evaluation.yaksha.testutils.TestUtils.boundaryTestFile;
import static com.iiht.evaluation.yaksha.testutils.TestUtils.businessTestFile;
import static com.iiht.evaluation.yaksha.testutils.TestUtils.currentTest;
import static com.iiht.evaluation.yaksha.testutils.TestUtils.exceptionTestFile;
import static com.iiht.evaluation.yaksha.testutils.TestUtils.testReport;
import static com.iiht.evaluation.yaksha.testutils.TestUtils.yakshaAssert;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class HCFofNumbersTest {

	@AfterAll
	public static void afterAll() {
		testReport();
	}

	@Test
	public void testGetHCFofNumbers() throws Exception {
		HCFofNumbers hcfOfNumbers = new HCFofNumbers();
		int firstNo = 10;
		int secNo = 15;
		Integer hcf = hcfOfNumbers.getHCFofNumbers(firstNo, secNo);
		if (hcf == null) {
			yakshaAssert(currentTest(), "false", businessTestFile);
			return;
		}
		yakshaAssert(currentTest(), hcf == 5 ? "true" : "false", businessTestFile);
	}

	@Test
	public void testGetHCFWithZeroNumber() throws Exception {
		HCFofNumbers hcfOfNumbers = new HCFofNumbers();
		int firstNo = 0;
		int secNo = 0;
		Integer hcf = hcfOfNumbers.getHCFofNumbers(firstNo, secNo);
		if (hcf == null) {
			yakshaAssert(currentTest(), "false", boundaryTestFile);
			return;
		}
		yakshaAssert(currentTest(), hcf == 0 ? "true" : "false", boundaryTestFile);
	}

	@Test
	public void testGetHCFWithSameNumbers() throws Exception {
		HCFofNumbers hcfOfNumbers = new HCFofNumbers();
		int firstNo = 1;
		int secNo = 1;
		Integer hcf = hcfOfNumbers.getHCFofNumbers(firstNo, secNo);
		if (hcf == null) {
			yakshaAssert(currentTest(), "false", boundaryTestFile);
			return;
		}
		yakshaAssert(currentTest(), hcf == 1 ? "true" : "false", boundaryTestFile);
	}

	@Test
	public void testGetHCFWithNegNumbers() throws Exception {
		HCFofNumbers hcfOfNumbers = new HCFofNumbers();
		int firstNo = -10;
		int secNo = -15;
		Integer hcf = hcfOfNumbers.getHCFofNumbers(firstNo, secNo);
		if (hcf == null) {
			yakshaAssert(currentTest(), "false", boundaryTestFile);
			return;
		}
		yakshaAssert(currentTest(), hcf == -5 ? "true" : "false", boundaryTestFile);
	}

	@Test
	public void testGetHCFWithOneZeroParam() throws Exception {
		HCFofNumbers hcfOfNumbers = new HCFofNumbers();
		int firstNo = 10;
		int secNo = 0;
		Integer hcf = hcfOfNumbers.getHCFofNumbers(firstNo, secNo);
		if (hcf == null) {
			yakshaAssert(currentTest(), "false", exceptionTestFile);
			return;
		}
		yakshaAssert(currentTest(), hcf == 0 ? "true" : "false", exceptionTestFile);
	}

}
