public class TileRunner {
    public static void main(String[] args) {
        System.out.println("Tile Specifications:");

        Tile.details("Ceramic", "12x12 inches", "White", "Glossy", "$10 per sq ft");
        Tile.details("Porcelain", "24x24 inches", "Beige", "Matte", "$15 per sq ft");
        Tile.details("Marble", "18x18 inches", "Gray", "Polished", "$50 per sq ft");
        Tile.details("Granite", "24x24 inches", "Black", "Honed", "$40 per sq ft");
        Tile.details("Vinyl", "12x24 inches", "Wood Texture", "Textured", "$8 per sq ft");
    }
}