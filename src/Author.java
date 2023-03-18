public class Author {
        private String authorFirstName;
        private String authorLastName;

        public Author(String authorFirstName, String authorLastName) {
            this.authorLastName = authorLastName;
            this.authorFirstName = authorFirstName;
        }

        public String getAuthorFirstName() {
            return authorFirstName;
        }

        public void getAuthorLastName(String authorLastName) {
            this.authorLastName = authorLastName;
        }
        public String toString(){
            return authorFirstName + " " + authorLastName;
        }
    }


