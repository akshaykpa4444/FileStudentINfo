package studentinfo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Student {

	public static void main(String[] args) {
		ArrayList<Studentinfo> dataList = new ArrayList<Studentinfo>();
		ArrayList<MarksInfo> marksList = new ArrayList<MarksInfo>();
		try {

			BufferedReader readData = new BufferedReader(
					new FileReader("E:\\Data\\Trainee4\\workspace/StudentInfo.csv"));
			BufferedReader readMarks = new BufferedReader(
					new FileReader("E:\\Data\\Trainee4\\workspace/StudentMarksInfo2.csv"));
			String stuData = null;
			readData.readLine();
			while ((stuData = readData.readLine()) != null) {
				String[] dataInfo = stuData.split(",");
				Studentinfo data = new Studentinfo();
				data.setId(Long.valueOf(dataInfo[0]));
				data.setName((dataInfo[1]));
				data.setAge(Long.valueOf(dataInfo[2]));
				dataList.add(data);
			}
			String marksData = null;
			readMarks.readLine();
			while ((marksData = readMarks.readLine()) != null) {
				String[] marksInfo = marksData.split(",");
				MarksInfo marks = new MarksInfo();
				marks.setId(Long.valueOf(marksInfo[0]));
				marks.setSub((marksInfo[1]));
				marks.setMarks(Long.valueOf(marksInfo[2]));

				marksList.add(marks);
			}
			for (int i = 0; i < dataList.size(); i++) {

				for (int j = 0; j < marksList.size(); j++) {

					if (dataList.get(i).getId() == marksList.get(j).getId()) {

						System.out.println("Id :" + dataList.get(i).getId() + "\t" + " Name :"
								+ dataList.get(i).getName() + "\t" + " Age :" + dataList.get(i).getAge() + ", "
								+ " Id :" + marksList.get(j).getId() + "\t" + " sub :" + marksList.get(j).getSub()
								+ "\t" + " Marks :" + marksList.get(j).getMarks());
					}
				}
			}

		} catch (

		Exception e) {
			System.out.println(e);
		}
	}

}
