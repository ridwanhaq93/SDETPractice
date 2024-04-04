package TimBachulkaChallenges;

public class SwitchStatementChallenge {
    String name;
    String id;

    public static void main(String[] args) {
        SwitchStatementChallenge s = new SwitchStatementChallenge("David","32");
        System.out.println(s.getId());
        System.out.println(s.getName());
        switchMethod('D');
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SwitchStatementChallenge(String name, String id) {
        this.name = name;
        this.id = id;

    }


    public static void switchMethod(char input) {
        switch (input) {
            case 'A':
                System.out.println(input + "=Able");
                break;
            case 'B':
                System.out.println(input + "= Baker");
                break;
            case 'C':
                System.out.println(input + "= Charlie ");
                break;
            case 'D':
                System.out.println(input + "= Dog");
                break;
            case 'E':
                System.out.println(input + "= Easy");
                break;
            default:
                System.out.println(input + " : letter not available");

        }
    }
}

