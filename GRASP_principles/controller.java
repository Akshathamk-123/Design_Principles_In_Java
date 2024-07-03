import java.util.ArrayList;
import java.util.List;

// Person class
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

// PersonModel class
class PersonModel {
    private List<Person> people;

    public PersonModel() {
        people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public List<Person> getPeople() {
        return people;
    }
}

// PersonView class
class PersonView {
    public void displayPeople(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

// PersonController class
class PersonController {
    private PersonModel model;
    private PersonView view;

    public PersonController(PersonModel model, PersonView view) {
        this.model = model;
        this.view = view;
    }

    public void addPerson(String name, int age) {
        Person person = new Person(name, age);
        model.addPerson(person);
    }

    public void removePerson(String name) {
        for (Person person : model.getPeople()) {
            if (person.getName().equalsIgnoreCase(name)) {
                model.removePerson(person);
                break;
            }
        }
    }

    public void updateView() {
        view.displayPeople(model.getPeople());
    }
}

// Main class to test the implementation
public class controller {
    public static void main(String[] args) {
        // Create the model, view, and controller
        PersonModel model = new PersonModel();
        PersonView view = new PersonView();
        PersonController controller = new PersonController(model, view);

        // Add some people
        controller.addPerson("Alice", 30);
        controller.addPerson("Bob", 25);

        // Update the view
        controller.updateView();

        // Remove a person
        controller.removePerson("Alice");

        // Update the view
        controller.updateView();
    }
}
