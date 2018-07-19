/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		String image = ("https://vignette.wikia.nocookie.net/nintendo/images/6/61/Super_Smash_Bros._Ultimate_-_Character_Art_-_Pichu.png/revision/latest/scale-to-width-down/480?cb=20180612175935&path-prefix=en");
		// 2. create a variable of type "Component" that will hold your image
		Component holder;
		// 3. use the "createImage()" method below to initialize your Component
		holder = createImage(image);
		// 4. add the image to the quiz window
		quizWindow.add(holder);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String question = JOptionPane.showInputDialog("what is it");
		// 7. print "CORRECT" if the user gave the right answer
		if (question == "pichu") {
			JOptionPane.showMessageDialog(null, "gud jobbbbbbbbb ");

		}

		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "u no notin");
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
         quizWindow.remove(holder);
		// 10. find another image and create it (might take more than one line of code)
String picture = ("data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxQTEBUPEhAQFRAPEBAQDxAPDxAPEA8QFREWFhURFRUYHSggGBolGxUXITEiJykrLi8uFx8zOjMsNyguLisBCgoKDg0OGxAQGy0dHyYtLS0tLy0rLS4tLS0vLS01LS0tKy0tKystLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLf/AABEIAPgAzAMBIgACEQEDEQH/xAAbAAEAAgMBAQAAAAAAAAAAAAAABQYDBAcBAv/EAEAQAAIBAwIEAwUFBQQLAAAAAAABAgMEEQUhBhIxQVFhcRMigaGxMkJSkcEHFCOS0TNDcuEVJFNigqKys9Lw8f/EABkBAQADAQEAAAAAAAAAAAAAAAABAgMEBf/EACQRAQACAgIBBAIDAAAAAAAAAAABAgMRITESBCJBURNhFDJx/9oADAMBAAIRAxEAPwDuIAAAAAAAABjr1lFZbG9DIad3qdOn9qW67LdkBrGvveMXheX9SoXt/JvqZ+e+nRTBvtdLvi2K+zH0cn+iIetxhV7SivSK/UqeXI2aNqydT9umuCv0mpcT13/ev4KK/Q+4cTXK/vM+sIP9COpWZtQshprGCv0kKPF9dfajTl6xlF/JkpZ8ZQe1SlKHnFqa/R/Ur/7l5HxK0JVn0tJ+HQLLUKdVZp1Iy8V0kvWL3RtHMFTcXlNpro02mvRomdN4nqU2o1f4kPHZVEvX73x/MnbmyekmP68rsDXsb2FWPPTkmu/Zxfg12ZsEuWY12AAIAAAAAAAAAAAAAHzUmopt9ioa5qmW9ye1utiGEc41e5eWY2nytp0Yq6jbFd3eWasVlmnKrubdtItEOujftqJKW9A07REzaxLOmsPujbG3C3MlCJu0qZetVL5PFo/u5jnblhpWixufFxZLGUTqGEeqjelXq2xoV7YsNejg0a1MpMadVZi0Ie0u50J+0pvD6NfdkvBo6BpeoRr01Uh6Si+sZLrFlFuaRk4c1H2FdRb/AIdVqE89E8+7L83j0ZEOX1OHyjcduggAs80AAAAAAAAAAAAAQ+uxymc21iHvM6nqVLKZQdZs93sc0Tq8umk+1TpdTdtZGO4t8M9t0bbdFJTlpU/9W7HBnE8L2FSUKdSHsp8jVTG+VlPbv4rsa1vMlLStj6vHj4kums8rHRkb1KoQlCubtOuXrZGTHtO0brYVrpYIhVzyVctw5f43O2S5nk0KrMtSqalaZS0uzHXTWrkVeRN+6qPlfLjmw+XPTmxtnyyV/Tp1/Yx/enTdfMuZ0vs45ny/HBVNpdY0a69rb06j6ygub/EtpfNM3CE4Nf8AqdP1qf8AckTZZ4t41aYAAFQAAAAAAAAAAY60cogdT03PYsRhlDtjbs/0OfNSf7Q0pfTnV/pD8CJqWLi+h0+5s0+xAajp68DKMjoraJ6VCMcGxTke3lPlZpqubVlvW6WpV8G5TuyDhcGVVy+28XT0bo9/eSCVz5nv72WW80zK4NepXI2V2YKl0ETdt3FwR1atn+nifFSrksnBOhOpUV1UX8KnLNNP+8qLv6J/P0YY5MsVja66Naeyt6dJ9YQipf4usvm2boBZ5czudgACAAAAAAAAAAADxo9AHw4kZqNDKJY+ZwT2aML4YnmF6X8Zc41a3eWV2vSaOr3ejRl0f5kHd8NPtHPpuRG69w3i8T1Lnbk0FcMt9fhxr7r/ACNKpoHkW84aRaUDG5Z77Zkx/oN+D+CyZqPDdWT92lP4xcV+b2LeUJ/JpCxyzLGgy32PB03jncYLv9+X5Lb5lk07QqVHDUeaa+9Pdr0XRDmVLZ4hU9A4SlUxUrJxpdVHpOp/4r5/UvlKmoxUYpKMUlFJYSS7I+wXiNOa95t2A+alRRTlJpRSy5SaSS8W2VbWuPbWlTmqNanWuFF+zp025xlLOFmS2wur36IlWImelrByzQ7aveS9rcV6km3tFScIR32UYLZFusp1LWpGnOcp0ZyUffblKm3smm+2cZQ03n08xHfP0soADnAAAPitVUYucmlGKzKTeEl4s+ykceX0pfwIv3I7y/3pf5ETOlq18p0waz+0LEnTtqaeNva1c4fpBY+b+BHU9fv57qu15RpUsfOJD6Rp3NPfxOg6dp8UsYRMcu6uGla7shrPiu6pv+NGFWHd8vs6nwa2+Rc9L1KnXh7SnLK6Si9pQfhJdiF1PTY8vQrNrdytK6qxzy/Zqx/FDO/xXVEdIvgravlR0wHzTqKUVKLzGSUotdGmspn0S4AAADzB6AAAAAAAfFWooxc5PEYpyk/BJZbPsieKpNWs0vvcsX6Z3EprG505hxPrFW9rOOWqEX/DpZ2S7Sku8iMoaM4VFPGzTT+JMafbfxN13Ljb6fFx3S6Dfw9KuKsVReh3XsY+8mvM2Zap+9XFO3hltzUpP8MItOUn9PVoxajbygsRa5fCSTx6Pqe/s4bVxcx65hSlzYW2JSWPjn5Fa7jiUZN0rtfgAWeaAAAyj8Q2uZSfqXgitUsuZMwzTrUtsMxE8qBps1CZOXvEMKFJ1HltbRiuspPoiB1i3dOTZDXLdSHO91GbXpsjSluNu+148dJi11e9u5Z51Th2hTitl5yeW3+XobOoaZWUcylzeqSfyN3hWcVTW25Yr24g6fTfG7LxyV9uoiO33wVXc7KlzdYc9P4Qm4x+SROFN/Z/c5qXNNfYjKlNeClJST/6F+Rcg87LGrzAD5qVFFOUmlGKbbfRJdzmnE/FU60nSptxpZxhbOfnL+hCKUm0rvfcR21LaVaLa+7DM36bdDTpcZ2reOaovN03j5FBstPc92Tlroa8A66+kjXK9WWpUqv9nUjLvhPEl6xe5tFClpTi1KLakt002mn5Mn9D1iTao1vt9IT6c/k/P6/Uzy+mmsbrzCeABLlDDeW6qQcH0kvn2MwEkTpQdQ0qVKXMlsZKGsKKxLYutegpLDRWtU4UdR5hKC9W19EZx5RPLtx+ojWpVzW9chyvDJ79nGmyhQnc1E1O6lGUU+qoxT5M+rlJ+jR7pfAtKE1UrS9q4vKhjFPPmvvfTyLcaKZ8/nxAAA5QAAD5nE+gVtWLRqRVuJNNUot4KVpUIKrK2qtRjWadOUtkqi25W+2V80vE6zXt1JYZUtb4IVbPLKKz+LK+iMq1tHEumMsTHKOdhKhFrD2K/qvEM17iTy3hJJttvoku7LroXCVeliNW/qTorpQ5ISWPw+0mnJLyWCetNEoU5+0hRgqnabXNJejfT4GlKzE88rfydRqETwDo07e2cqqxXuJe1qR7044xCm/NLd+cmizAF3LM7ncqzxzeuFDkT+1vL0XRfn9Dl1i+ap8TofH9Ntf8KRz/AEuGJ/EinO3ZgjpdtIpJJFrsaKaKpY1MJE5Z3uCay6s9LWr7Va42uLmhce0VSp7BwSoUqNOE+aqlvzppuWXthduhKXdJuCk1yzxGTSe8JYzjPkyaqXOSK1CrsyZjhbHeZrWsxEa+fv8A1Y9Ku/a0Y1O7WJf4ls/mjbIHg6pmjNfhrSS/liyeIeTkr43mIAAFAAAAAAAAAAAAAAAAAAAAABGa3YKrDHfBQbnSfZybx3OoNEJrmn80W0tzC0zS36l0Yb/EqjQrY2JChXXiQV7SlF9GaqvZI1jl6FcsLhK6SXUh9S1BdMkHVvqktlk3+HNBqXNVc+VSi06sumV+Beb+RMwi+atYXvg6g42kZPrVlKp8HtH5JP4k2eQikkksJJJJdEl2PSXlWt5TMgACoAAAAAAAAAAAAAAAAAAAAAHko5PQRMb7ETf6NGe6SIiXCuX0X5otoKfjiOpaRltCuWnCkE8zfwj3+JP0KEYRUIRUYrokZAXiIhW1pnsABKoAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHkpJLLaS8W8ID0GjV1ihHZ1YfDMvofVtqlGo8QqwbfSOcSfomRuE6luAAlAAAABV+JeLVQzClFSmtnKWeRPwwt38iJnSYrM9LQDkFbjO+m/drKK8IUqeP8AmTZtWnHF7D7fsqq789Pkl8HDC+RLX8FnVQVXRuOqFXEKqdCo/wAbzTb8p9vikWlPO66PdNdwztWa9vQAFQAAAAAAAAAAACua/rXKnCD9Wu/+RW1tLVrNpbWra9Ckmo4lLx+6v6lL1HWJ1HvJvw8F6LsalxWlORvadpud2V1vt3YsEI50py33MFalJeJdoaelHoQ2qWyROm8Y6z0mOBNdlVUrerJupSSlCT3c6ecb+LT7+aLacs4Qny6lTX441YvzXI3j84o6mXh5uasVvwAAMmG7m1Tk11UXj1OS8R025v1OsX1WMYNyzytxjtGUt5SUVlJPbL3fRdXsVTW9Hzl4Mb21aHRhUmwtyWpadnsa6ouEsE7p00XidvRxxEoa40XboeaVq1eykuVudHPvUZt8uO/L+F+n5MuVKipGvqWg5jnl7dUX6UvGOfbKe0XWKVzT9pSl02nB7Tpy8JL9ejJA5FGVSzrqvS6x2lF/ZqQ7wl5fQ6lpWoQr0Y1qb92a6d4y7xfmmHn5sU0n9NsABiAAAAAAB81G1FtdUm0nsm8ARWt6kowai/FN+mzX5lBua7nIn+JpPpv/AF8yu2XXcxpPl7noYKRCRsLItOmWsVjPQhLSqiUjeqK6msadOWszXVUlqNxFR5UkUvWbtbmbVtYW+GQ2l6dVvavJDanFr2tV9ILPReMsdEO2dYjFROfs7sXKtUumnyxj7KDxs5SacmvRJfzF+MFjZwpU40qcUoQWEl82/Fvq2ZyXm5L+VtgACjxo1J008031S93fLlHbf4Zx/wDTcMdakpLD6reLXWLxjK89yl6RaExOlQ1rS+6RBRqODOgXdF4xJNropxWf5orp69PQp+s6e1lrp4oxrM1nUu7FmbFjqS7snaWpe7jO2DmdetKD7ma312S8Tojem0+F+1k1ygpJs1/2f3rp3U7Zv3K0XOKf+0h4esc/yoh6+u5R5wlF1tRpcuypuVWb8IxX6tpfEQpnms1deABLzQAAAAAAAFa1+zznYpN2uRnV61FSWJLKKxf8IOo/7aKTzuqTyvBY5t/zRjFJrPHTqpmiO1KhquO5judb26ltt/2b0c5q3FaflBQpRf1fh37E9Z8K2lKUZwtqfNT+zKfNUae3ve83vt16rc100n1UfCg8NcP1b2SqzUoWvV1Hs6q8Ka7p/i6eGTp9jZQo01SpQUYRWEl9W+783ubAJct8k3nkAAZgAAAADxo1q+nwn9pNtt7rZ7vo8bPC23NoETGyJ0rF9whGe6njyce/qiIq8Cyztyv0ePqX4EeMfDSMllDocA5+3NRXl70v6Ft0fSKVtD2dKCWd5Se85vxk+5vgmI0ra8z2AAlUAAAAAAAAAAAAAeZPQAAAAHkpJbtpLxbwARM6hMPFUXivzR6mAVrbcpmunoALqgAAAAAAAAAA/9k=");

		// 11.
   Component hold;
   hold = createImage(picture);
   quizWindow.add(hold);
		// 12. pack the quiz window
           quizWindow.pack();
		// 13. ask another question
         String request = JOptionPane.showInputDialog("hu is dis");
		// 14+ check answer, say if correct or incorrect, etc.
            if (request == "sukapon") {
            	JOptionPane.showMessageDialog(null,"u r corekt");
            }
            else {
            	JOptionPane.showMessageDialog(parentComponent, message);
            }
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
