import java.util.Objects;

public class Author {
        private final String authorFirstName;
        private final String authorLastName;

        public Author(String authorFirstName, String authorLastName) {
            this.authorLastName = authorLastName;
            this.authorFirstName = authorFirstName;
        }

        public String getAuthorFirstName() {
            return authorFirstName;
        }

        public String getAuthorLastName() {
            return authorLastName;
        }
        public String toString(){
            return authorFirstName + " " + authorLastName;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorFirstName, author.authorFirstName) && Objects.equals(authorLastName, author.authorLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName, authorLastName);
    }
}


