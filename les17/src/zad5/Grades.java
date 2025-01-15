    package zad5;

    public class Grades {

        private String capitalize(String str) {
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        private String gradeToString(String grade) {
            switch (grade) {
                case "5":
                    return "Безупречно";
                case "4":
                    return "Потрясающе";
                case "3":
                    return "Восхитительно";
                case "2":
                    return "Прекрасно";
                default:
                    return "Очаровательно";
            }
        }
        public void gradeBeautifier(String grades) {
        String[] data = grades.split(";");
            for (String item : data) {

                if (item.trim().isEmpty()) {
                    continue;
                }
                String[] info = item.split(",");
                String name = capitalize(info[0].trim());
                String surname = capitalize(info[1].trim());
                String subject = info[2].trim().toLowerCase();
                String grade = gradeToString(info[3].trim());
                System.out.println(name + " " + surname + " " + subject + " — " + grade);
            }
        }
        public static void main(String[] args) {
            Grades grades = new Grades();
            String input = "вероника,чехова,ФИЗИКА,5;анна,строкова,МАТЕМАТИКА,4;иван,петров,ГЕОМЕТРИЯ,5";
            grades.gradeBeautifier(input);
        }
    }