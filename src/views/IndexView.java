package views;

import httpserver.BaseView;
import httpserver.StructureBuilder;
import httpserver.StyleBuilder;

import java.util.Objects;

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
                for (int i = 0; i < data.govTitles.size(); i++) {
                    final int idx = i;
                    builder.div("card", () -> {
                        builder.h4(() -> builder.text(data.govDates.get(idx)));
                        builder.h2(() -> builder.text(data.govTitles.get(idx)));
                        builder.p(() -> builder.text(data.govDescs.get(idx)));
                    });
                }
            });
//
//            builder.h1(() -> builder.text("China CCTV News"));
//            builder.div("news", () -> {
//                for (int i = 0; i < data.cctvTitles.size(); i++) {
//                    final int idx = i;
//                    builder.div("card", () -> {
//                        builder.h2(() -> builder.text(data.cctvTitles.get(idx)));
//                        builder.p(() -> builder.text(data.cctvDescs.get(idx)));
//                    });
//                }
//            });
//
            builder.h1(() -> builder.text("Macau Daily News"));
            builder.div("news", () -> {
                for (int i = 0; i < data.govTitles.size(); i++) {
                    final int idx = i;
                    builder.div("card", () -> {
                        builder.h2(() -> builder.text(data.govTitles.get(idx)));
//                        builder.p(() -> builder.text(data.govDescs.get(idx)));
                    });
                }
            });

            builder.h1(() -> builder.text("Image and Sound"));
            builder.div("center", () -> {
                builder.audio(attr().controls(""), () -> {
                    builder.source(attr().src("public/sound.wav").type("audio/mpeg"), () -> {
                    });
                    builder.text("Your browser does not support the audio element.");
                });
                builder.img(attr().src("public/image.jpeg"), () -> {
                });
                builder.script(() -> {
                    builder.text("function enlargeImage(img) { img.style.transform = 'scale(1.3)'; img.style.transition = 'transform 0.25s ease'; } document.querySelectorAll('img').forEach(img => img.addEventListener('click', () => enlargeImage(img)));");
                });
            });

            builder.h1(() -> builder.text("Dictionary"));
            builder.div("dict", () -> {
                builder.form(attr().method("get").action("/"), () -> {
                    builder.label(attr().for_("word"), () -> {
                        builder.text("Enter Word");
                    });
                    builder.input(attr().id("word").name("word").value(data.word), () -> {
                    });
                });
                if (Objects.isNull(data.word))
                    return;
                builder.div("word-content", () -> {
                    if (!data.doesWordExists) {
                        builder.p("error", () -> builder.text("The word does not exist."));
                        return;
                    }
                    builder.h2(() -> builder.text("Meaning"));
                    builder.p(() -> builder.text(data.wordDesc));
                });
            });
        });
        builder.div("space", () -> {
        });
        builder.footer(() -> {
            builder.text("This is is by Leong Chi Tou and Chi Fat");
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
        builder.select("form", attr -> {
            attr.display("flex");
            attr.font_size("24px");
            attr.align_items("center");
            attr.gap("1rem");
            attr.flex_direction("column");
        });
        builder.select("label", attr -> {
            attr.display("block");
        });
        builder.select("input", attr -> {
            attr.display("block");
            attr.outline("none");
            attr.box_shadow("0px 2px 10px rgba(0,0,0,0.25)");
            attr.border("none");
            attr.border_radius("5px");
            attr.padding("0.5rem 1rem");
//            attr.border("1px solid black");
        });
        builder.select(".error", attr -> {
            attr.color("red");
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
            attr.gap("0.5rem");
        });
        builder.select(".news h2", attr -> {
            attr.height("200px");
//            attr.overflow("hidden");
        });
        builder.select(".word-content", attr -> {
            attr.max_width("600px");
            attr.margin("0 auto");
            attr.margin_top("2rem");
            attr.display("flex");
            attr.flex_direction("column");
            attr.align_items("center");
        });
        builder.select(".center", attr -> {
            attr.display("flex");
            attr.flex_direction("column");
            attr.justify_items("center");
        });
        builder.select(".space", attr -> {
            attr.min_height("5rem");
            attr.flex("1");
        });

        builder.select("footer", attr -> {
            attr.padding("1rem 0");
            attr.background_color("black");
            attr.color("rgb(214,214,214)");
            attr.text_align("center");
        });
    }
}
