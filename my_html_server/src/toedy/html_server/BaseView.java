package toedy.html_server;

public abstract class BaseView<T> {
    protected final T data;

    public BaseView(T data) {
        this.data = data;
    }

    protected static StructureAttributes attr() {
        return new StructureAttributes();
    }

    protected abstract String getTitle();

    protected abstract void buildStructure(final StructureBuilder builder);

    protected abstract void buildStyle(final StyleBuilder builder);

    @Override
    public String toString() {
        final StructureBuilder structureBuilder = new StructureBuilder(WebConfig.minifyOutput);
        final StyleBuilder styleBuilder = new StyleBuilder(WebConfig.minifyOutput);
        structureBuilder.html(() -> {
            structureBuilder.head(() -> {
                structureBuilder.title(() -> structureBuilder.text(getTitle()));
            });
            structureBuilder.body(() -> {
                buildStructure(structureBuilder);
                structureBuilder.style(() -> {
                    buildStyle(styleBuilder);
                    structureBuilder.textRaw(styleBuilder.toString());
                });
            });
        });
        return structureBuilder.toString();
    }
}
