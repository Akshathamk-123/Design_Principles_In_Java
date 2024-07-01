import java.util.ArrayList;
import java.util.List;

// Section class
class Section {
    private String title;
    private String content;

    public Section(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Section Title: " + title + "\nContent: " + content;
    }
}

// Document class that uses Section
class Document {
    private List<Section> sections;

    public Document() {
        sections = new ArrayList<>();
    }

    public void addSection(String title, String content) {
        Section section = new Section(title, content);
        sections.add(section);
    }

    public void display() {
        for (Section section : sections) {
            System.out.println(section);
            System.out.println("------------------------------");
        }
    }
}

// Main class to test the implementation
public class CreatorPrincipleExample {
    public static void main(String[] args) {
        Document document = new Document();
        document.addSection("Introduction", "This is the introduction section.");
        document.addSection("Chapter 1", "This is the first chapter.");
        document.addSection("Conclusion", "This is the conclusion section.");

        document.display();
    }
}
