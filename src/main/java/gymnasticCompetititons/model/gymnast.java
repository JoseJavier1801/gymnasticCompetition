package gymnasticCompetititons.model;
public class gymnast extends person {
    private CategoryTrial Category;
    private String Club;

    public gymnast(String DNI, String name, int phone, String mail, CategoryTrial category, String club) {
        super(DNI, name, phone, mail);
        Category = category;
        Club = club;
    }

    public CategoryTrial getCategory() {
        return Category;
    }

    public void setCategory(CategoryTrial category) {
        Category = category;
    }

    public String getClub() {
        return Club;
    }

    public void setClub(String club) {
        Club = club;
    }

    @Override
    public String toString() {
        return super.toString()+"gymnast{" +
                "Category=" + Category +
                ", Club='" + Club + '\'' +
                '}';
    }
}
