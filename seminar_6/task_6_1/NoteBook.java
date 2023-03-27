package seminar_6.task_6_1;

public class NoteBook {

    // ОЗУ
    private OZU memoryOZU;
    // Объем ЖД
    private Hard memoryHardDisc;

    // Операционная система
    private OS os;

    // Цвет
    private Color color;

    public NoteBook(final NoteBook.OZU memoryOZU, final NoteBook.Hard memoryHardDisc, final NoteBook.OS os,
            final NoteBook.Color color) {
        super();
        this.memoryOZU = memoryOZU;
        this.memoryHardDisc = memoryHardDisc;
        this.os = os;
        this.color = color;
    }

    public OZU getMemoryOZU() {
        return this.memoryOZU;
    }

    public void setMemoryOZU(final OZU memoryOZU) {
        this.memoryOZU = memoryOZU;
    }

    public Hard getMemoryHardDisc() {
        return this.memoryHardDisc;
    }

    public void setMemoryHardDisc(final Hard memoryHardDisc) {
        this.memoryHardDisc = memoryHardDisc;
    }

    public OS getOs() {
        return this.os;
    }

    public void setOs(final OS os) {
        this.os = os;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(final Color color) {
        this.color = color;
    }

    enum OS {
        LINUX,
        WINDOWS,
        MAC
    }

    enum Color {
        RED,
        BLUE,
        BLACK,
        WHITE,
        SILVER,
    }

    enum OZU {
        OZU_4GB,
        OZU_8GB,
        OZU_16GB,
        OZU_32GB
    }

    enum Hard {
        HARD_128GB,
        HARD_256GB,
        HARD_512GB,
        HARD_1024GB
    }

    @Override
    public String toString() {
        return "NoteBook [" + (this.memoryOZU != null ? "memoryOZU=" + this.memoryOZU + ", " : "")
                + (this.memoryHardDisc != null ? "memoryHardDisc=" + this.memoryHardDisc + ", " : "")
                + (this.os != null ? "os=" + this.os + ", " : "") + (this.color != null ? "color=" + this.color : "")
                + "]";
    }

}
