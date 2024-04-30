package views;

import httpserver.BaseView;
import httpserver.StructureBuilder;
import httpserver.StyleBuilder;

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
                builder.a(attr().href("#"), () -> builder.text("CISC3016 WebProject"));
            });
        });
        builder.main(() -> {
            builder.h1(() -> builder.text("Macau Government News"));
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
        builder.div("space", () -> {
        });
        builder.footer(() -> {
            builder.text("This is is by Leong Chi Tou and F");
        });
    }

    @Override
    protected void buildStyle(StyleBuilder builder) {
        builder.select(":root", attr -> {
            attr.font_family("sans-serif");
            attr.font_size("16px");
        });
        builder.select("a", attr -> {
            attr.display("inline-block");
            attr.text_decoration("none");
            attr.color("inherit");
            attr.transition("all 0.1s ease-out");
        });
        builder.select("a:hover", attr -> {
            attr.transform("scale(1.05)");
        });

        builder.select("body", attr -> {
            attr.padding("0");
            attr.margin("0");
            attr.background("radial-gradient(circle at 50% 60%, #222 0%, #333 100%)");
            attr.display("flex");
            attr.flex_direction("column");
            attr.min_height("100vh");
            attr.color("white");
        });
        builder.select("header", attr -> {
            attr.position("sticky");
            attr.top("0");
            attr.padding("1rem 3rem");
            attr.background_color("#ccc");
            attr.background("linear-gradient(to right, #00bfff 0%, #59ff00 100%)");
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
        builder.select(".news h2", attr -> {
            attr.height("200px");
//            attr.overflow("hidden");
        });
        builder.select(".space", attr -> attr.flex("1"));

        builder.select("footer", attr -> {
            attr.padding("1rem 0");
            attr.background_color("black");
            attr.color("rgb(214,214,214)");
            attr.text_align("center");
        });
    }
}
