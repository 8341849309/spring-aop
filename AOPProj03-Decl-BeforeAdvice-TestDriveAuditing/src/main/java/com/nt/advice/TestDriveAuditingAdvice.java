package com.nt.advice;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class TestDriveAuditingAdvice {

	public void testDriving(JoinPoint jp) throws Throwable {
		System.out.println("TestDriveAuditingAdvice.testDriving()");
		Object[] obj = jp.getArgs();
		String logMsg = "Car " + obj[1] + " is taken by " + obj[0] + " for test drive on "+new Date()+"\n";
		Writer writer = new FileWriter(
				"D:/RDP/Eclipse work bench/SpringAOP/AOPProj03-Decl-BeforeAdvice-TestDriveAuditing/resources/test-drive.txt",
				true);
		writer.write(logMsg);
		writer.flush();
		writer.close();
	}

}
