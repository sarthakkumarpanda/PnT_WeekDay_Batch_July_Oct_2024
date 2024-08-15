package com.learning_Java_Day13_14th_Aug_Objects_in_depth;

public class Topic3_Student_Execution {

	public static void main(String[] args) {
		Topic2_Student student = new Topic2_Student();
		student.name = "TOM";
		student.age = 5;
		student.promotion = true;
		student.classEnrollment = "1stGrade";
		student.primarySubject = "Drawing";
		
		Topic2_Student.studentDataBaseConnection();
		
		student.studentAdminData();
		student.studentUserData();
		student.studentFinancialData();
		student.studentAttendanceData();

	}

}
