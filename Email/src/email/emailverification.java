package email;

import java.util.ArrayList;

public class emailverification {

	public static void main(String[] args) {

		ArrayList<String> emailID = new ArrayList<String>();

		emailID.add("abcm@movie.com");
		emailID.add("hello@movie.com");
		emailID.add("jes@movie.com");
		emailID.add("karuna@movie.com");
		emailID.add("deva2@movie.com");
		emailID.add("prabhu@movie.com");

		int c = 0;

		String searchEmail = "hello@movie.com";

		for (int i = 0; i < emailID.size(); i++) {

			if (searchEmail == emailID.get(i)) {

				System.out.println("\n");

				c = 1;

				break;

			}
		}

		if (c == 1) {
			System.out.println("email ID :" + searchEmail + "  is found");
		} else {
			System.out.println("email ID Not found");
		}

	}
}
