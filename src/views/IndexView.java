package views;

import toedy.html_server.BaseView;
import toedy.html_server.StructureBuilder;
import toedy.html_server.StyleBuilder;


public class IndexView extends BaseView<IndexData> {
    public IndexView(IndexData data) {
        super(data);
    }

    @Override
    protected String getTitle() {
        return "CISC3016 WebProject";
    }

    @Override
    protected void buildStructure(StructureBuilder builder) {
        builder.header(() -> {
            builder.h1(() -> {
                builder.text("CISC3016 WebProject");
            });
        });
        builder.main(() -> {
            builder.div("news", () -> {
                for (int i = 0; i < data.titles.size(); i++) {
                    final int idx = i;
                    builder.div("card", () -> {
                        builder.h4(() -> builder.text(data.dates.get(idx)));
                        builder.h2(() -> builder.text(data.titles.get(idx)));
                        builder.p(() -> builder.text(data.descs.get(idx)));
                    });
                }
            });
        });
    }

    @Override
    protected void buildStyle(StyleBuilder builder) {
        builder.select("body", attr -> {
            attr.padding("0");
            attr.margin("0");
        });
        builder.select("header", attr -> {
            attr.position("sticky");
            attr.top("0");
            attr.padding("1rem 3rem");
            attr.background_color("#ccc");
            attr.border_bottom("1px solid lightgray");
            attr.z_index("99999");
        });
        builder.select("main", attr -> {
            attr.max_width("1200px");
            attr.margin("0 auto");
        });
        builder.select(".news", attr -> {
            attr.display("grid");
            attr.grid_template_columns("1fr 1fr 1fr 1fr");
        });
    }
}
