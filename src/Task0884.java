import java.util.List;

/*
Таблица
*/

public class Task0884 {
    public class TableInterfaceWrapper implements TableInterface {
        private TableInterface original;

        public TableInterfaceWrapper(TableInterface tableInterface) {
            original = tableInterface;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            original.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return original.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            original.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}