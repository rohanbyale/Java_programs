import java.util.Scanner;

class CourseContent {
    private String title;

    CourseContent(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class Video extends CourseContent {
    private int duration;

    Video(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

class Article extends CourseContent {
    private String author;

    Article(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class Quiz extends CourseContent {
    private int numberOfQuestions;

    Quiz(String title, int numberOfQuestions) {
        super(title);
        this.numberOfQuestions = numberOfQuestions;
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }
}

class CourseManager {

    public void processContent(CourseContent c) {

        if (c instanceof Video) {
            Video v = (Video) c;

            if (v.getDuration() <= 0) {
                System.out.println("Error: Invalid duration for video.");
            } else {
                System.out.println("Processing Video: "
                        + v.getTitle()
                        + " | Duration: "
                        + v.getDuration() + " mins");
            }
        }

        else if (c instanceof Article) {
            Article a = (Article) c;

            System.out.println("Processing Article: "
                    + a.getTitle()
                    + " | Author: "
                    + a.getAuthor());
        }

        else if (c instanceof Quiz) {
            Quiz q = (Quiz) c;

            System.out.println("Processing Quiz: "
                    + q.getTitle()
                    + " | Questions: "
                    + q.getNumberOfQuestions());
        }
    }

    public void processMultipleContents(CourseContent... c) {
        for (CourseContent x : c) {
            processContent(x);
        }
    }
}

public class MainCourse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        sc.nextLine();

        CourseManager cm = new CourseManager();

        if (choice == 1) {

            String title = sc.nextLine();
            int duration = sc.nextInt();

            Video v = new Video(title, duration);

            cm.processContent(v);

        } else if (choice == 2) {

            String title = sc.nextLine();
            String author = sc.nextLine();

            Article a = new Article(title, author);

            cm.processContent(a);

        } else if (choice == 3) {

            String title = sc.nextLine();
            int questions = sc.nextInt();

            Quiz q = new Quiz(title, questions);

            cm.processContent(q);
        }
    }
}