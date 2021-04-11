public class Player {

    private String name;
    private String email;
    private boolean white;
    private int rank;
    private int age;

    public Player(String name, String email, boolean white, int rank, int age) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException("Enter valid name, please ");
        } else {
            this.name = name;
        }

        if (email == null || email.isBlank() || email.isEmpty()) {
            throw new IllegalArgumentException("Enter valid email, please ");
        } else if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Enter valid email, please ");
        } else {
            this.name = email;
        }

        this.white = white;
        this.rank = rank;
        this.age = age;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isBlank() || email.isEmpty()) {
            throw new IllegalArgumentException("Enter valid email, please ");
        } else if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Enter valid email, please ");
        } else {
            this.name = email;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        if (rank < 100 || rank > 3000) {
            throw new IllegalArgumentException("Rank should be in range of 100 and 3000");
        } else {
            this.rank = rank;
            System.out.println("The rank of " + name + " was changed to " + rank);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player's " +
                "name is '" + name + '\'' +
                ",\nemail is '" + email + '\'' +
                ",\nwhite is " + white +
                ",\nrank is " + rank +
                ",\nage is " + age;
    }

    public void movePiece(Piece piece, Spot spot) {
        if (isWhite() != piece.isWhite()) {
            throw new IllegalArgumentException("Incorrect piece color. Try again");
        }
        piece.setSpot(spot);
        System.out.println("Piece " + piece.getName() + " is moved to: " + spot);
    }

}

