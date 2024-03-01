public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[5];

        readers[0] = new Reader("Петров В. В.", 37, "Факультет 1", "01.01.2006", "+79836452758");
        readers[1] = new Reader("Харитонов С. И.", 456, "Факультет 2", "02.02.2010", "+7629746386");
        readers[2] = new Reader("Куплинов А. А.", 7, "Факультет 3", "03.03.2013", "+79675847385");
        readers[3] = new Reader("Корнуз Н. Н.", 678, "Факультет 4", "04.04.2010", "+72547385746");
        readers[4] = new Reader("Усов Е. В.", 59, "Факультет 5", "05.05.2000", "+73425275849");

        readers[0].takeBook(3);
        readers[1].takeBook("Приключения", "Словарь", "Энциклопедия");
        readers[2].returnBook(4);
        readers[3].returnBook("Приключения", "Словарь", "Энциклопедия");
    }
}
class Reader {
    public String fullName;
    public int TicketNumber;
    public String faculty;
    public String dateOfBirth;
    public String phoneNumber;

    public Reader(String fullName, int TicketNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.TicketNumber = TicketNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги.");
    }

    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " взял книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги.");
    }

    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " вернул книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
    }
}