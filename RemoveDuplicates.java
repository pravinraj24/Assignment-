package week6.day1;

public class RemoveDuplicates {
public static void main(String[] args) {
	String text = "We learn java basics as part of java sessions in java week1";
	int count = 0;
	String[] split = text.split(" ");
	for (int i = 0; i < split.length; i++) {
		count=0;
		for (int j = i+1; j < split.length; j++) {
			if (split[i].equals(split[j])) {
				count++;
			}
		}
		if (count > 0) {
			split[i] = "";
		}
	}

	for (int i = 0; i < split.length; i++) {
		if (split[i]!="") {
			System.out.print(split[i]+" ");
		}
	}
}
}
