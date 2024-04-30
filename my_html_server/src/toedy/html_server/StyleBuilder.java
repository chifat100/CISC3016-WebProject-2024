package toedy.html_server;

public class StyleBuilder {
    private final boolean mini;
    private final StringBuilder sb;
    private int depth = 0;

    public StyleBuilder(boolean mini) {
        this.mini = mini;
        sb = new StringBuilder();
    }

    public void select(String selector, CSSAttributes attributes) {
        if (!mini)
            sb.append("  ".repeat(depth));
        sb.append(selector);
        if (!mini)
            sb.append(" {\n");
        else
            sb.append('{');

        depth++;
        attributes.call(new Attributes());
        depth--;

        if (!mini)
            sb.append("  ".repeat(depth));
        sb.append('}');
        if (!mini)
            sb.append("\n\n");
    }

    public void keyframes(String name, CSSSelectors selectors) {
        keyframeOrMedia("@keyframes " + name, selectors);
    }

    public void media(String query, CSSSelectors selectors) {
        keyframeOrMedia("@media (" + query + ")", selectors);
    }

    private void keyframeOrMedia(String header, CSSSelectors selectors) {
        if (!mini)
            sb.append("  ".repeat(depth));
        sb.append(header);
        if (!mini)
            sb.append(" {\n");
        else
            sb.append('{');

        depth++;
        selectors.call(new Selector());
        depth--;

        if (!mini)
            sb.append("  ".repeat(depth));
        sb.append('}');
        if (!mini)
            sb.append("\n\n");
    }

    private void add(String name, String value) {
        if (!mini)
            sb.append("  ".repeat(depth));
        sb.append(name);
        sb.append(':');
        if (!mini)
            sb.append(' ');
        sb.append(value);
        sb.append(';');
        if (!mini)
            sb.append('\n');
    }

    @Override
    public String toString() {
        return sb.toString();
    }

    @FunctionalInterface
    public interface CSSAttributes {
        void call(Attributes attr);
    }

    @FunctionalInterface
    public interface CSSSelectors {
        void call(Selector selector);
    }

    public class Selector {
        public void select(String selector, CSSAttributes attributes) {
            StyleBuilder.this.select(selector, attributes);
        }
    }

    public class Attributes {
        public void attr(String name, String value) {
            add(name, value);
        }

        /**
         * Specifies an accent color for user-interface controls
         */
        public void accent_color(String value) {
            add("accent-color", value);
        }

        /**
         * Specifies the alignment between the lines inside a flexible container when the items do not use all available space
         */
        public void align_content(String value) {
            add("align-content", value);
        }

        /**
         * Specifies the alignment for items inside a flexible container
         */
        public void align_items(String value) {
            add("align-items", value);
        }

        /**
         * Specifies the alignment for selected items inside a flexible container
         */
        public void align_self(String value) {
            add("align-self", value);
        }

        /**
         * Resets all properties (except unicode-bidi and direction)
         */
        public void all(String value) {
            add("all", value);
        }

        /**
         * A shorthand property for all the animation-* properties
         */
        public void animation(String value) {
            add("animation", value);
        }

        /**
         * Specifies a delay for the start of an animation
         */
        public void animation_delay(String value) {
            add("animation-delay", value);
        }

        /**
         * Specifies whether an animation should be played forwards, backwards or in alternate cycles
         */
        public void animation_direction(String value) {
            add("animation-direction", value);
        }

        /**
         * Specifies how long an animation should take to complete one cycle
         */
        public void animation_duration(String value) {
            add("animation-duration", value);
        }

        /**
         * Specifies a style for the element when the animation is not playing (before it starts, after it ends, or both)
         */
        public void animation_fill_mode(String value) {
            add("animation-fill-mode", value);
        }

        /**
         * Specifies the number of times an animation should be played
         */
        public void animation_iteration_count(String value) {
            add("animation-iteration-count", value);
        }

        /**
         * Specifies a name for the @keyframes animation
         */
        public void animation_name(String value) {
            add("animation-name", value);
        }

        /**
         * Specifies whether the animation is running or paused
         */
        public void animation_play_state(String value) {
            add("animation-play-state", value);
        }

        /**
         * Specifies the speed curve of an animation
         */
        public void animation_timing_function(String value) {
            add("animation-timing-function", value);
        }

        /**
         * Specifies preferred aspect ratio of an element
         */
        public void aspect_ratio(String value) {
            add("aspect-ratio", value);
        }

        /**
         * Defines a graphical effect to the area behind an element
         */
        public void backdrop_filter(String value) {
            add("backdrop-filter", value);
        }

        /**
         * Defines whether the back face of an element should be visible when facing the user
         */
        public void backface_visibility(String value) {
            add("backface-visibility", value);
        }

        /**
         * A shorthand property for all the background-* properties
         */
        public void background(String value) {
            add("background", value);
        }

        /**
         * Sets whether a background image scrolls with the rest of the page, or is fixed
         */
        public void background_attachment(String value) {
            add("background-attachment", value);
        }

        /**
         * Specifies the blending mode of each background layer (color/image)
         */
        public void background_blend_mode(String value) {
            add("background-blend-mode", value);
        }

        /**
         * Defines how far the background (color or image) should extend within an element
         */
        public void background_clip(String value) {
            add("background-clip", value);
        }

        /**
         * Specifies the background color of an element
         */
        public void background_color(String value) {
            add("background-color", value);
        }

        /**
         * Specifies one or more background images for an element
         */
        public void background_image(String value) {
            add("background-image", value);
        }

        /**
         * Specifies the origin position of a background image
         */
        public void background_origin(String value) {
            add("background-origin", value);
        }

        /**
         * Specifies the position of a background image
         */
        public void background_position(String value) {
            add("background-position", value);
        }

        /**
         * Specifies the position of a background image on x-axis
         */
        public void background_position_x(String value) {
            add("background-position-x", value);
        }

        /**
         * Specifies the position of a background image on y-axis
         */
        public void background_position_y(String value) {
            add("background-position-y", value);
        }

        /**
         * Sets if/how a background image will be repeated
         */
        public void background_repeat(String value) {
            add("background-repeat", value);
        }

        /**
         * Specifies the size of the background images
         */
        public void background_size(String value) {
            add("background-size", value);
        }

        /**
         * Specifies the size of an element in block direction
         */
        public void block_size(String value) {
            add("block-size", value);
        }

        /**
         * A shorthand property for border-width, border-style and border-color
         */
        public void border(String value) {
            add("border", value);
        }

        /**
         * A shorthand property for border-block-width, border-block-style and border-block-color
         */
        public void border_block(String value) {
            add("border-block", value);
        }

        /**
         * Sets the color of the borders at start and end in the block direction
         */
        public void border_block_color(String value) {
            add("border-block-color", value);
        }

        /**
         * A shorthand property for border-block-end-width, border-block-end-style and border-block-end-color
         */
        public void border_block_end(String value) {
            add("border-block-end", value);
        }

        /**
         * Sets the color of the border at the end in the block direction
         */
        public void border_block_end_color(String value) {
            add("border-block-end-color", value);
        }

        /**
         * Sets the style of the border at the end in the block direction
         */
        public void border_block_end_style(String value) {
            add("border-block-end-style", value);
        }

        /**
         * Sets the width of the border at the end in the block direction
         */
        public void border_block_end_width(String value) {
            add("border-block-end-width", value);
        }

        /**
         * A shorthand property for border-block-start-width, border-block-start-style and border-block-start-color
         */
        public void border_block_start(String value) {
            add("border-block-start", value);
        }

        /**
         * Sets the color of the border at the start in the block direction
         */
        public void border_block_start_color(String value) {
            add("border-block-start-color", value);
        }

        /**
         * Sets the style of the border at the start in the block direction
         */
        public void border_block_start_style(String value) {
            add("border-block-start-style", value);
        }

        /**
         * Sets the width of the border at the start in the block direction
         */
        public void border_block_start_width(String value) {
            add("border-block-start-width", value);
        }

        /**
         * Sets the style of the borders at start and end in the block direction
         */
        public void border_block_style(String value) {
            add("border-block-style", value);
        }

        /**
         * Sets the width of the borders at start and end in the block direction
         */
        public void border_block_width(String value) {
            add("border-block-width", value);
        }

        /**
         * A shorthand property for border-bottom-width, border-bottom-style and border-bottom-color
         */
        public void border_bottom(String value) {
            add("border-bottom", value);
        }

        /**
         * Sets the color of the bottom border
         */
        public void border_bottom_color(String value) {
            add("border-bottom-color", value);
        }

        /**
         * Defines the radius of the border of the bottom-left corner
         */
        public void border_bottom_left_radius(String value) {
            add("border-bottom-left-radius", value);
        }

        /**
         * Defines the radius of the border of the bottom-right corner
         */
        public void border_bottom_right_radius(String value) {
            add("border-bottom-right-radius", value);
        }

        /**
         * Sets the style of the bottom border
         */
        public void border_bottom_style(String value) {
            add("border-bottom-style", value);
        }

        /**
         * Sets the width of the bottom border
         */
        public void border_bottom_width(String value) {
            add("border-bottom-width", value);
        }

        /**
         * Sets whether table borders should collapse into a single border or be separated
         */
        public void border_collapse(String value) {
            add("border-collapse", value);
        }

        /**
         * Sets the color of the four borders
         */
        public void border_color(String value) {
            add("border-color", value);
        }

        /**
         * Sets the radius of the corner between the block-end and the inline-end sides of the element
         */
        public void border_end_end_radius(String value) {
            add("border-end-end-radius", value);
        }

        /**
         * Sets the radius of the corner between the block-end and the inline-start sides of the element
         */
        public void border_end_start_radius(String value) {
            add("border-end-start-radius", value);
        }

        /**
         * A shorthand property for all the border-image-* properties
         */
        public void border_image(String value) {
            add("border-image", value);
        }

        /**
         * Specifies the amount by which the border image area extends beyond the border box
         */
        public void border_image_outset(String value) {
            add("border-image-outset", value);
        }

        /**
         * Specifies whether the border image should be repeated, rounded or stretched
         */
        public void border_image_repeat(String value) {
            add("border-image-repeat", value);
        }

        /**
         * Specifies how to slice the border image
         */
        public void border_image_slice(String value) {
            add("border-image-slice", value);
        }

        /**
         * Specifies the path to the image to be used as a border
         */
        public void border_image_source(String value) {
            add("border-image-source", value);
        }

        /**
         * Specifies the width of the border image
         */
        public void border_image_width(String value) {
            add("border-image-width", value);
        }

        /**
         * A shorthand property for border-inline-width, border-inline-style and border-inline-color
         */
        public void border_inline(String value) {
            add("border-inline", value);
        }

        /**
         * Sets the color of the borders at start and end in the inline direction
         */
        public void border_inline_color(String value) {
            add("border-inline-color", value);
        }

        /**
         * A shorthand property for border-inline-end-width, border-inline-end-style and border-inline-end-color
         */
        public void border_inline_end(String value) {
            add("border-inline-end", value);
        }

        /**
         * Sets the color of the border at the end in the inline direction
         */
        public void border_inline_end_color(String value) {
            add("border-inline-end-color", value);
        }

        /**
         * Sets the style of the border at the end in the inline direction
         */
        public void border_inline_end_style(String value) {
            add("border-inline-end-style", value);
        }

        /**
         * Sets the width of the border at the end in the inline direction
         */
        public void border_inline_end_width(String value) {
            add("border-inline-end-width", value);
        }

        /**
         * A shorthand property for border-inline-start-width, border-inline-start-style and border-inline-start-color
         */
        public void border_inline_start(String value) {
            add("border-inline-start", value);
        }

        /**
         * Sets the color of the border at the start in the inline direction
         */
        public void border_inline_start_color(String value) {
            add("border-inline-start-color", value);
        }

        /**
         * Sets the style of the border at the start in the inline direction
         */
        public void border_inline_start_style(String value) {
            add("border-inline-start-style", value);
        }

        /**
         * Sets the width of the border at the start in the inline direction
         */
        public void border_inline_start_width(String value) {
            add("border-inline-start-width", value);
        }

        /**
         * Sets the style of the borders at start and end in the inline direction
         */
        public void border_inline_style(String value) {
            add("border-inline-style", value);
        }

        /**
         * Sets the width of the borders at start and end in the inline direction
         */
        public void border_inline_width(String value) {
            add("border-inline-width", value);
        }

        /**
         * A shorthand property for all the border-left-* properties
         */
        public void border_left(String value) {
            add("border-left", value);
        }

        /**
         * Sets the color of the left border
         */
        public void border_left_color(String value) {
            add("border-left-color", value);
        }

        /**
         * Sets the style of the left border
         */
        public void border_left_style(String value) {
            add("border-left-style", value);
        }

        /**
         * Sets the width of the left border
         */
        public void border_left_width(String value) {
            add("border-left-width", value);
        }

        /**
         * A shorthand property for the four border-*-radius properties
         */
        public void border_radius(String value) {
            add("border-radius", value);
        }

        /**
         * A shorthand property for all the border-right-* properties
         */
        public void border_right(String value) {
            add("border-right", value);
        }

        /**
         * Sets the color of the right border
         */
        public void border_right_color(String value) {
            add("border-right-color", value);
        }

        /**
         * Sets the style of the right border
         */
        public void border_right_style(String value) {
            add("border-right-style", value);
        }

        /**
         * Sets the width of the right border
         */
        public void border_right_width(String value) {
            add("border-right-width", value);
        }

        /**
         * Sets the distance between the borders of adjacent cells
         */
        public void border_spacing(String value) {
            add("border-spacing", value);
        }

        /**
         * Sets the radius of the corner between the block-start and the inline-end sides of the element
         */
        public void border_start_end_radius(String value) {
            add("border-start-end-radius", value);
        }

        /**
         * Sets the radius of the corner between the block-start and the inline-start sides of the element
         */
        public void border_start_start_radius(String value) {
            add("border-start-start-radius", value);
        }

        /**
         * Sets the style of the four borders
         */
        public void border_style(String value) {
            add("border-style", value);
        }

        /**
         * A shorthand property for border-top-width, border-top-style and border-top-color
         */
        public void border_top(String value) {
            add("border-top", value);
        }

        /**
         * Sets the color of the top border
         */
        public void border_top_color(String value) {
            add("border-top-color", value);
        }

        /**
         * Defines the radius of the border of the top-left corner
         */
        public void border_top_left_radius(String value) {
            add("border-top-left-radius", value);
        }

        /**
         * Defines the radius of the border of the top-right corner
         */
        public void border_top_right_radius(String value) {
            add("border-top-right-radius", value);
        }

        /**
         * Sets the style of the top border
         */
        public void border_top_style(String value) {
            add("border-top-style", value);
        }

        /**
         * Sets the width of the top border
         */
        public void border_top_width(String value) {
            add("border-top-width", value);
        }

        /**
         * Sets the width of the four borders
         */
        public void border_width(String value) {
            add("border-width", value);
        }

        /**
         * Sets the elements position, from the bottom of its parent element
         */
        public void bottom(String value) {
            add("bottom", value);
        }

        /**
         * Sets the behavior of the background and border of an element at page-break, or, for in-line elements, at line-break.
         */
        public void box_decoration_break(String value) {
            add("box-decoration-break", value);
        }

        /**
         * The box-reflect property is used to create a reflection of an element.
         */
        public void box_reflect(String value) {
            add("box-reflect", value);
        }

        /**
         * Attaches one or more shadows to an element
         */
        public void box_shadow(String value) {
            add("box-shadow", value);
        }

        /**
         * Defines how the width and height of an element are calculated: should they include padding and borders, or not
         */
        public void box_sizing(String value) {
            add("box-sizing", value);
        }

        /**
         * Specifies whether or not a page-, column-, or region-break should occur after the specified element
         */
        public void break_after(String value) {
            add("break-after", value);
        }

        /**
         * Specifies whether or not a page-, column-, or region-break should occur before the specified element
         */
        public void break_before(String value) {
            add("break-before", value);
        }

        /**
         * Specifies whether or not a page-, column-, or region-break should occur inside the specified element
         */
        public void break_inside(String value) {
            add("break-inside", value);
        }

        /**
         * Specifies the placement of a table caption
         */
        public void caption_side(String value) {
            add("caption-side", value);
        }

        /**
         * Specifies the color of the cursor (caret) in inputs, textareas, or any element that is editable
         */
        public void caret_color(String value) {
            add("caret-color", value);
        }

        /**
         * Specifies what should happen with the element that is next to a floating element
         */
        public void clear(String value) {
            add("clear", value);
        }

        /**
         * Clips an absolutely positioned element
         */
        public void clip(String value) {
            add("clip", value);
        }

        /**
         * Clips an element to a basic shape or to an SVG source
         */
        public void clip_path(String value) {
            add("clip-path", value);
        }

        /**
         * Sets the color of text
         */
        public void color(String value) {
            add("color", value);
        }

        /**
         * Specifies the number of columns an element should be divided into
         */
        public void column_count(String value) {
            add("column-count", value);
        }

        /**
         * Specifies how to fill columns, balanced or not
         */
        public void column_fill(String value) {
            add("column-fill", value);
        }

        /**
         * Specifies the gap between the columns
         */
        public void column_gap(String value) {
            add("column-gap", value);
        }

        /**
         * A shorthand property for all the column-rule-* properties
         */
        public void column_rule(String value) {
            add("column-rule", value);
        }

        /**
         * Specifies the color of the rule between columns
         */
        public void column_rule_color(String value) {
            add("column-rule-color", value);
        }

        /**
         * Specifies the style of the rule between columns
         */
        public void column_rule_style(String value) {
            add("column-rule-style", value);
        }

        /**
         * Specifies the width of the rule between columns
         */
        public void column_rule_width(String value) {
            add("column-rule-width", value);
        }

        /**
         * Specifies how many columns an element should span across
         */
        public void column_span(String value) {
            add("column-span", value);
        }

        /**
         * Specifies the column width
         */
        public void column_width(String value) {
            add("column-width", value);
        }

        /**
         * A shorthand property for column-width and column-count
         */
        public void columns(String value) {
            add("columns", value);
        }

        /**
         * Used with the :before and :after pseudo-elements, to insert generated content
         */
        public void content(String value) {
            add("content", value);
        }

        /**
         * Increases or decreases the value of one or more CSS counters
         */
        public void counter_increment(String value) {
            add("counter-increment", value);
        }

        /**
         * Creates or resets one or more CSS counters
         */
        public void counter_reset(String value) {
            add("counter-reset", value);
        }

        /**
         * Creates or sets one or more CSS counters
         */
        public void counter_set(String value) {
            add("counter-set", value);
        }

        /**
         * Specifies the mouse cursor to be displayed when pointing over an element
         */
        public void cursor(String value) {
            add("cursor", value);
        }

        /**
         * Specifies the text direction/writing direction
         */
        public void direction(String value) {
            add("direction", value);
        }

        /**
         * Specifies how a certain HTML element should be displayed
         */
        public void display(String value) {
            add("display", value);
        }

        /**
         * Specifies whether to display borders and background on empty cells in a table
         */
        public void empty_cells(String value) {
            add("empty-cells", value);
        }

        /**
         * Defines effects (e.g. blurring or color shifting) on an element before the element is displayed
         */
        public void filter(String value) {
            add("filter", value);
        }

        /**
         * A shorthand property for the flex-grow, flex-shrink, and the flex-basis properties
         */
        public void flex(String value) {
            add("flex", value);
        }

        /**
         * Specifies the initial length of a flexible item
         */
        public void flex_basis(String value) {
            add("flex-basis", value);
        }

        /**
         * Specifies the direction of the flexible items
         */
        public void flex_direction(String value) {
            add("flex-direction", value);
        }

        /**
         * A shorthand property for the flex-direction and the flex-wrap properties
         */
        public void flex_flow(String value) {
            add("flex-flow", value);
        }

        /**
         * Specifies how much the item will grow relative to the rest
         */
        public void flex_grow(String value) {
            add("flex-grow", value);
        }

        /**
         * Specifies how the item will shrink relative to the rest
         */
        public void flex_shrink(String value) {
            add("flex-shrink", value);
        }

        /**
         * Specifies whether the flexible items should wrap or not
         */
        public void flex_wrap(String value) {
            add("flex-wrap", value);
        }

        /**
         * Specifies whether an element should float to the left, right, or not at all
         */
        public void float_(String value) {
            add("float", value);
        }

        /**
         * A shorthand property for the font-style, font-variant, font-weight, font-size/line-height, and the font-family properties
         */
        public void font(String value) {
            add("font", value);
        }

        /**
         * Specifies the font family for text
         */
        public void font_family(String value) {
            add("font-family", value);
        }

        /**
         * Allows control over advanced typographic features in OpenType fonts
         */
        public void font_feature_settings(String value) {
            add("font-feature-settings", value);
        }

        /**
         * Controls the usage of the kerning information (how letters are spaced)
         */
        public void font_kerning(String value) {
            add("font-kerning", value);
        }

        /**
         * Controls the usage of language-specific glyphs in a typeface
         */
        public void font_language_override(String value) {
            add("font-language-override", value);
        }

        /**
         * Specifies the font size of text
         */
        public void font_size(String value) {
            add("font-size", value);
        }

        /**
         * Preserves the readability of text when font fallback occurs
         */
        public void font_size_adjust(String value) {
            add("font-size-adjust", value);
        }

        /**
         * Selects a normal, condensed, or expanded face from a font family
         */
        public void font_stretch(String value) {
            add("font-stretch", value);
        }

        /**
         * Specifies the font style for text
         */
        public void font_style(String value) {
            add("font-style", value);
        }

        /**
         * Controls which missing typefaces (bold or italic) may be synthesized by the browser
         */
        public void font_synthesis(String value) {
            add("font-synthesis", value);
        }

        /**
         * Specifies whether or not a text should be displayed in a small-caps font
         */
        public void font_variant(String value) {
            add("font-variant", value);
        }

        /**
         * Controls the usage of alternate glyphs associated to alternative names defined in @font-feature-values
         */
        public void font_variant_alternates(String value) {
            add("font-variant-alternates", value);
        }

        /**
         * Controls the usage of alternate glyphs for capital letters
         */
        public void font_variant_caps(String value) {
            add("font-variant-caps", value);
        }

        /**
         * Controls the usage of alternate glyphs for East Asian scripts (e.g Japanese and Chinese)
         */
        public void font_variant_east_asian(String value) {
            add("font-variant-east-asian", value);
        }

        /**
         * Controls which ligatures and contextual forms are used in textual content of the elements it applies to
         */
        public void font_variant_ligatures(String value) {
            add("font-variant-ligatures", value);
        }

        /**
         * Controls the usage of alternate glyphs for numbers, fractions, and ordinal markers
         */
        public void font_variant_numeric(String value) {
            add("font-variant-numeric", value);
        }

        /**
         * Controls the usage of alternate glyphs of smaller size positioned as superscript or subscript regarding the baseline of the font
         */
        public void font_variant_position(String value) {
            add("font-variant-position", value);
        }

        /**
         * Specifies the weight of a font
         */
        public void font_weight(String value) {
            add("font-weight", value);
        }

        /**
         * A shorthand property for the row-gap and the column-gap properties
         */
        public void gap(String value) {
            add("gap", value);
        }

        /**
         * A shorthand property for the grid-template-rows, grid-template-columns, grid-template-areas, grid-auto-rows, grid-auto-columns, and the grid-auto-flow properties
         */
        public void grid(String value) {
            add("grid", value);
        }

        /**
         * Either specifies a name for the grid item, or this property is a shorthand property for the grid-row-start, grid-column-start, grid-row-end, and grid-column-end properties
         */
        public void grid_area(String value) {
            add("grid-area", value);
        }

        /**
         * Specifies a default column size
         */
        public void grid_auto_columns(String value) {
            add("grid-auto-columns", value);
        }

        /**
         * Specifies how auto-placed items are inserted in the grid
         */
        public void grid_auto_flow(String value) {
            add("grid-auto-flow", value);
        }

        /**
         * Specifies a default row size
         */
        public void grid_auto_rows(String value) {
            add("grid-auto-rows", value);
        }

        /**
         * A shorthand property for the grid-column-start and the grid-column-end properties
         */
        public void grid_column(String value) {
            add("grid-column", value);
        }

        /**
         * Specifies where to end the grid item
         */
        public void grid_column_end(String value) {
            add("grid-column-end", value);
        }

        /**
         * Specifies the size of the gap between columns
         */
        public void grid_column_gap(String value) {
            add("grid-column-gap", value);
        }

        /**
         * Specifies where to start the grid item
         */
        public void grid_column_start(String value) {
            add("grid-column-start", value);
        }

        /**
         * A shorthand property for the grid-row-gap and grid-column-gap properties
         */
        public void grid_gap(String value) {
            add("grid-gap", value);
        }

        /**
         * A shorthand property for the grid-row-start and the grid-row-end properties
         */
        public void grid_row(String value) {
            add("grid-row", value);
        }

        /**
         * Specifies where to end the grid item
         */
        public void grid_row_end(String value) {
            add("grid-row-end", value);
        }

        /**
         * Specifies the size of the gap between rows
         */
        public void grid_row_gap(String value) {
            add("grid-row-gap", value);
        }

        /**
         * Specifies where to start the grid item
         */
        public void grid_row_start(String value) {
            add("grid-row-start", value);
        }

        /**
         * A shorthand property for the grid-template-rows, grid-template-columns and grid-areas properties
         */
        public void grid_template(String value) {
            add("grid-template", value);
        }

        /**
         * Specifies how to display columns and rows, using named grid items
         */
        public void grid_template_areas(String value) {
            add("grid-template-areas", value);
        }

        /**
         * Specifies the size of the columns, and how many columns in a grid layout
         */
        public void grid_template_columns(String value) {
            add("grid-template-columns", value);
        }

        /**
         * Specifies the size of the rows in a grid layout
         */
        public void grid_template_rows(String value) {
            add("grid-template-rows", value);
        }

        /**
         * Specifies whether a punctuation character may be placed outside the line box
         */
        public void hanging_punctuation(String value) {
            add("hanging-punctuation", value);
        }

        /**
         * Sets the height of an element
         */
        public void height(String value) {
            add("height", value);
        }

        /**
         * Sets how to split words to improve the layout of text
         */
        public void hyphens(String value) {
            add("hyphens", value);
        }

        /**
         * Sets the character used at the end of line, before a hyphenation break
         */
        public void hypenate_character(String value) {
            add("hypenate-character", value);
        }

        /**
         * Specifies the type of algorithm to use for image scaling
         */
        public void image_rendering(String value) {
            add("image-rendering", value);
        }

        /**
         * Specifies the size of an element in the inline direction
         */
        public void inline_size(String value) {
            add("inline-size", value);
        }

        /**
         * Specifies the distance between an element and the parent element
         */
        public void inset(String value) {
            add("inset", value);
        }

        /**
         * Specifies the distance between an element and the parent element in the block direction
         */
        public void inset_block(String value) {
            add("inset-block", value);
        }

        /**
         * Specifies the distance between the end of an element and the parent element in the block direction
         */
        public void inset_block_end(String value) {
            add("inset-block-end", value);
        }

        /**
         * Specifies the distance between the start of an element and the parent element in the block direction
         */
        public void inset_block_start(String value) {
            add("inset-block-start", value);
        }

        /**
         * Specifies the distance between an element and the parent element in the inline direction
         */
        public void inset_inline(String value) {
            add("inset-inline", value);
        }

        /**
         * Specifies the distance between the end of an element and the parent element in the inline direction
         */
        public void inset_inline_end(String value) {
            add("inset-inline-end", value);
        }

        /**
         * Specifies the distance between the start of an element and the parent element in the inline direction
         */
        public void inset_inline_start(String value) {
            add("inset-inline-start", value);
        }

        /**
         * Defines whether an element must create a new stacking content
         */
        public void isolation(String value) {
            add("isolation", value);
        }

        /**
         * Specifies the alignment between the items inside a flexible container when the items do not use all available space
         */
        public void justify_content(String value) {
            add("justify-content", value);
        }

        /**
         * Is set on the grid container. Specifies the alignment of grid items in the inline direction
         */
        public void justify_items(String value) {
            add("justify-items", value);
        }

        /**
         * Is set on the grid item. Specifies the alignment of the grid item in the inline direction
         */
        public void justify_self(String value) {
            add("justify-self", value);
        }

        /**
         * Specifies the left position of a positioned element
         */
        public void left(String value) {
            add("left", value);
        }

        /**
         * Increases or decreases the space between characters in a text
         */
        public void letter_spacing(String value) {
            add("letter-spacing", value);
        }

        /**
         * Specifies how/if to break lines
         */
        public void line_break(String value) {
            add("line-break", value);
        }

        /**
         * Sets the line height
         */
        public void line_height(String value) {
            add("line-height", value);
        }

        /**
         * Sets all the properties for a list in one declaration
         */
        public void list_style(String value) {
            add("list-style", value);
        }

        /**
         * Specifies an image as the list-item marker
         */
        public void list_style_image(String value) {
            add("list-style-image", value);
        }

        /**
         * Specifies the position of the list-item markers (bullet points)
         */
        public void list_style_position(String value) {
            add("list-style-position", value);
        }

        /**
         * Specifies the type of list-item marker
         */
        public void list_style_type(String value) {
            add("list-style-type", value);
        }

        /**
         * Sets all the margin properties in one declaration
         */
        public void margin(String value) {
            add("margin", value);
        }

        /**
         * Specifies the margin in the block direction
         */
        public void margin_block(String value) {
            add("margin-block", value);
        }

        /**
         * Specifies the margin at the end in the block direction
         */
        public void margin_block_end(String value) {
            add("margin-block-end", value);
        }

        /**
         * Specifies the margin at the start in the block direction
         */
        public void margin_block_start(String value) {
            add("margin-block-start", value);
        }

        /**
         * Sets the bottom margin of an element
         */
        public void margin_bottom(String value) {
            add("margin-bottom", value);
        }

        /**
         * Specifies the margin in the inline direction
         */
        public void margin_inline(String value) {
            add("margin-inline", value);
        }

        /**
         * Specifies the margin at the end in the inline direction
         */
        public void margin_inline_end(String value) {
            add("margin-inline-end", value);
        }

        /**
         * Specifies the margin at the start in the inline direction
         */
        public void margin_inline_start(String value) {
            add("margin-inline-start", value);
        }

        /**
         * Sets the left margin of an element
         */
        public void margin_left(String value) {
            add("margin-left", value);
        }

        /**
         * Sets the right margin of an element
         */
        public void margin_right(String value) {
            add("margin-right", value);
        }

        /**
         * Sets the top margin of an element
         */
        public void margin_top(String value) {
            add("margin-top", value);
        }

        /**
         * Hides parts of an element by masking or clipping an image at specific places
         */
        public void mask(String value) {
            add("mask", value);
        }

        /**
         * Specifies the mask area
         */
        public void mask_clip(String value) {
            add("mask-clip", value);
        }

        /**
         * Represents a compositing operation used on the current mask layer with the mask layers below it
         */
        public void mask_composite(String value) {
            add("mask-composite", value);
        }

        /**
         * Specifies an image to be used as a mask layer for an element
         */
        public void mask_image(String value) {
            add("mask-image", value);
        }

        /**
         * Specifies whether the mask layer image is treated as a luminance mask or as an alpha mask
         */
        public void mask_mode(String value) {
            add("mask-mode", value);
        }

        /**
         * Specifies the origin position (the mask position area) of a mask layer image
         */
        public void mask_origin(String value) {
            add("mask-origin", value);
        }

        /**
         * Sets the starting position of a mask layer image (relative to the mask position area)
         */
        public void mask_position(String value) {
            add("mask-position", value);
        }

        /**
         * Specifies how the mask layer image is repeated
         */
        public void mask_repeat(String value) {
            add("mask-repeat", value);
        }

        /**
         * Specifies the size of a mask layer image
         */
        public void mask_size(String value) {
            add("mask-size", value);
        }

        /**
         * Specifies whether an SVG <mask> element is treated as a luminance mask or as an alpha mask
         */
        public void mask_type(String value) {
            add("mask-type", value);
        }

        /**
         * Sets the maximum height of an element
         */
        public void max_height(String value) {
            add("max-height", value);
        }

        /**
         * Sets the maximum width of an element
         */
        public void max_width(String value) {
            add("max-width", value);
        }

        /**
         * Sets the maximum size of an element in the block direction
         */
        public void max_block_size(String value) {
            add("max-block-size", value);
        }

        /**
         * Sets the maximum size of an element in the inline direction
         */
        public void max_inline_size(String value) {
            add("max-inline-size", value);
        }

        /**
         * Sets the minimum size of an element in the block direction
         */
        public void min_block_size(String value) {
            add("min-block-size", value);
        }

        /**
         * Sets the minimum size of an element in the inline direction
         */
        public void min_inline_size(String value) {
            add("min-inline-size", value);
        }

        /**
         * Sets the minimum height of an element
         */
        public void min_height(String value) {
            add("min-height", value);
        }

        /**
         * Sets the minimum width of an element
         */
        public void min_width(String value) {
            add("min-width", value);
        }

        /**
         * Specifies how an element's content should blend with its direct parent background
         */
        public void mix_blend_mode(String value) {
            add("mix-blend-mode", value);
        }

        /**
         * Specifies how the contents of a replaced element should be fitted to the box established by its used height and width
         */
        public void object_fit(String value) {
            add("object-fit", value);
        }

        /**
         * Specifies the alignment of the replaced element inside its box
         */
        public void object_position(String value) {
            add("object-position", value);
        }

        /**
         * Is a shorthand, and specifies how to animate an element along a path
         */
        public void offset(String value) {
            add("offset", value);
        }

        /**
         * Specifies a point on an element that is fixed to the path it is animated along
         */
        public void offset_anchor(String value) {
            add("offset-anchor", value);
        }

        /**
         * Specifies the position along a path where an animated element is placed
         */
        public void offset_distance(String value) {
            add("offset-distance", value);
        }

        /**
         * Specifies the path an element is animated along
         */
        public void offset_path(String value) {
            add("offset-path", value);
        }

        /**
         * Specifies rotation of an element as it is animated along a path
         */
        public void offset_rotate(String value) {
            add("offset-rotate", value);
        }

        /**
         * Sets the opacity level for an element
         */
        public void opacity(String value) {
            add("opacity", value);
        }

        /**
         * Sets the order of the flexible item, relative to the rest
         */
        public void order(String value) {
            add("order", value);
        }

        /**
         * Sets the minimum number of lines that must be left at the bottom of a page or column
         */
        public void orphans(String value) {
            add("orphans", value);
        }

        /**
         * A shorthand property for the outline-width, outline-style, and the outline-color properties
         */
        public void outline(String value) {
            add("outline", value);
        }

        /**
         * Sets the color of an outline
         */
        public void outline_color(String value) {
            add("outline-color", value);
        }

        /**
         * Offsets an outline, and draws it beyond the border edge
         */
        public void outline_offset(String value) {
            add("outline-offset", value);
        }

        /**
         * Sets the style of an outline
         */
        public void outline_style(String value) {
            add("outline-style", value);
        }

        /**
         * Sets the width of an outline
         */
        public void outline_width(String value) {
            add("outline-width", value);
        }

        /**
         * Specifies whether or not the browser can break lines with long words, if they overflow the container
         */
        public void overflow_wrap(String value) {
            add("overflow-wrap", value);
        }

        /**
         * Specifies whether or not to clip the left/right edges of the content, if it overflows the element's content area
         */
        public void overflow_x(String value) {
            add("overflow-x", value);
        }

        /**
         * Specifies whether or not to clip the top/bottom edges of the content, if it overflows the element's content area
         */
        public void overflow_y(String value) {
            add("overflow-y", value);
        }

        /**
         * Specifies whether to have scroll chaining or overscroll affordance in x- and y-directions
         */
        public void overscroll_behavior(String value) {
            add("overscroll-behavior", value);
        }

        /**
         * Specifies whether to have scroll chaining or overscroll affordance in the block direction
         */
        public void overscroll_behavior_block(String value) {
            add("overscroll-behavior-block", value);
        }

        /**
         * Specifies whether to have scroll chaining or overscroll affordance in the inline direction
         */
        public void overscroll_behavior_inline(String value) {
            add("overscroll-behavior-inline", value);
        }

        /**
         * Specifies whether to have scroll chaining or overscroll affordance in x-direction
         */
        public void overscroll_behavior_x(String value) {
            add("overscroll-behavior-x", value);
        }

        /**
         * Specifies whether to have scroll chaining or overscroll affordance in y-directions
         */
        public void overscroll_behavior_y(String value) {
            add("overscroll-behavior-y", value);
        }

        /**
         * A shorthand property for all the padding-* properties
         */
        public void padding(String value) {
            add("padding", value);
        }

        /**
         * Specifies the padding in the block direction
         */
        public void padding_block(String value) {
            add("padding-block", value);
        }

        /**
         * Specifies the padding at the end in the block direction
         */
        public void padding_block_end(String value) {
            add("padding-block-end", value);
        }

        /**
         * Specifies the padding at the start in the block direction
         */
        public void padding_block_start(String value) {
            add("padding-block-start", value);
        }

        /**
         * Sets the bottom padding of an element
         */
        public void padding_bottom(String value) {
            add("padding-bottom", value);
        }

        /**
         * Specifies the padding in the inline direction
         */
        public void padding_inline(String value) {
            add("padding-inline", value);
        }

        /**
         * Specifies the padding at the end in the inline direction
         */
        public void padding_inline_end(String value) {
            add("padding-inline-end", value);
        }

        /**
         * Specifies the padding at the start in the inline direction
         */
        public void padding_inline_start(String value) {
            add("padding-inline-start", value);
        }

        /**
         * Sets the left padding of an element
         */
        public void padding_left(String value) {
            add("padding-left", value);
        }

        /**
         * Sets the right padding of an element
         */
        public void padding_right(String value) {
            add("padding-right", value);
        }

        /**
         * Sets the top padding of an element
         */
        public void padding_top(String value) {
            add("padding-top", value);
        }

        /**
         * Sets the page-break behavior after an element
         */
        public void page_break_after(String value) {
            add("page-break-after", value);
        }

        /**
         * Sets the page-break behavior before an element
         */
        public void page_break_before(String value) {
            add("page-break-before", value);
        }

        /**
         * Sets the page-break behavior inside an element
         */
        public void page_break_inside(String value) {
            add("page-break-inside", value);
        }

        /**
         * Sets the order of how an SVG element or text is painted.
         */
        public void paint_order(String value) {
            add("paint-order", value);
        }

        /**
         * Gives a 3D-positioned element some perspective
         */
        public void perspective(String value) {
            add("perspective", value);
        }

        /**
         * Defines at which position the user is looking at the 3D-positioned element
         */
        public void perspective_origin(String value) {
            add("perspective-origin", value);
        }

        /**
         * Specifies align-content and justify-content property values for flexbox and grid layouts
         */
        public void place_content(String value) {
            add("place-content", value);
        }

        /**
         * Specifies align-items and justify-items property values for grid layouts
         */
        public void place_items(String value) {
            add("place-items", value);
        }

        /**
         * Specifies align-self and justify-self property values for grid layouts
         */
        public void place_self(String value) {
            add("place-self", value);
        }

        /**
         * Defines whether or not an element reacts to pointer events
         */
        public void pointer_events(String value) {
            add("pointer-events", value);
        }

        /**
         * Specifies the type of positioning method used for an element (static, relative, absolute or fixed)
         */
        public void position(String value) {
            add("position", value);
        }

        /**
         * Sets the type of quotation marks for embedded quotations
         */
        public void quotes(String value) {
            add("quotes", value);
        }

        /**
         * Defines if (and how) an element is resizable by the user
         */
        public void resize(String value) {
            add("resize", value);
        }

        /**
         * Specifies the right position of a positioned element
         */
        public void right(String value) {
            add("right", value);
        }

        /**
         * Specifies the rotation of an element
         */
        public void rotate(String value) {
            add("rotate", value);
        }

        /**
         * Specifies the gap between the grid rows
         */
        public void row_gap(String value) {
            add("row-gap", value);
        }

        /**
         * Specifies the size of an element by scaling up or down
         */
        public void scale(String value) {
            add("scale", value);
        }

        /**
         * Specifies whether to smoothly animate the scroll position in a scrollable box, instead of a straight jump
         */
        public void scroll_behavior(String value) {
            add("scroll-behavior", value);
        }

        /**
         * Specifies the margin between the snap position and the container
         */
        public void scroll_margin(String value) {
            add("scroll-margin", value);
        }

        /**
         * Specifies the margin between the snap position and the container in the block direction
         */
        public void scroll_margin_block(String value) {
            add("scroll-margin-block", value);
        }

        /**
         * Specifies the end margin between the snap position and the container in the block direction
         */
        public void scroll_margin_block_end(String value) {
            add("scroll-margin-block-end", value);
        }

        /**
         * Specifies the start margin between the snap position and the container in the block direction
         */
        public void scroll_margin_block_start(String value) {
            add("scroll-margin-block-start", value);
        }

        /**
         * Specifies the margin between the snap position on the bottom side and the container
         */
        public void scroll_margin_bottom(String value) {
            add("scroll-margin-bottom", value);
        }

        /**
         * Specifies the margin between the snap position and the container in the inline direction
         */
        public void scroll_margin_inline(String value) {
            add("scroll-margin-inline", value);
        }

        /**
         * Specifies the end margin between the snap position and the container in the inline direction
         */
        public void scroll_margin_inline_end(String value) {
            add("scroll-margin-inline-end", value);
        }

        /**
         * Specifies the start margin between the snap position and the container in the inline direction
         */
        public void scroll_margin_inline_start(String value) {
            add("scroll-margin-inline-start", value);
        }

        /**
         * Specifies the margin between the snap position on the left side and the container
         */
        public void scroll_margin_left(String value) {
            add("scroll-margin-left", value);
        }

        /**
         * Specifies the margin between the snap position on the right side and the container
         */
        public void scroll_margin_right(String value) {
            add("scroll-margin-right", value);
        }

        /**
         * Specifies the margin between the snap position on the top side and the container
         */
        public void scroll_margin_top(String value) {
            add("scroll-margin-top", value);
        }

        /**
         * Specifies the distance from the container to the snap position on the child elements
         */
        public void scroll_padding(String value) {
            add("scroll-padding", value);
        }

        /**
         * Specifies the distance in block direction from the container to the snap position on the child elements
         */
        public void scroll_padding_block(String value) {
            add("scroll-padding-block", value);
        }

        /**
         * Specifies the distance in block direction from the end of the container to the snap position on the child elements
         */
        public void scroll_padding_block_end(String value) {
            add("scroll-padding-block-end", value);
        }

        /**
         * Specifies the distance in block direction from the start of the container to the snap position on the child elements
         */
        public void scroll_padding_block_start(String value) {
            add("scroll-padding-block-start", value);
        }

        /**
         * Specifies the distance from the bottom of the container to the snap position on the child elements
         */
        public void scroll_padding_bottom(String value) {
            add("scroll-padding-bottom", value);
        }

        /**
         * Specifies the distance in inline direction from the container to the snap position on the child elements
         */
        public void scroll_padding_inline(String value) {
            add("scroll-padding-inline", value);
        }

        /**
         * Specifies the distance in inline direction from the end of the container to the snap position on the child elements
         */
        public void scroll_padding_inline_end(String value) {
            add("scroll-padding-inline-end", value);
        }

        /**
         * Specifies the distance in inline direction from the start of the container to the snap position on the child elements
         */
        public void scroll_padding_inline_start(String value) {
            add("scroll-padding-inline-start", value);
        }

        /**
         * Specifies the distance from the left side of the container to the snap position on the child elements
         */
        public void scroll_padding_left(String value) {
            add("scroll-padding-left", value);
        }

        /**
         * Specifies the distance from the right side of the container to the snap position on the child elements
         */
        public void scroll_padding_right(String value) {
            add("scroll-padding-right", value);
        }

        /**
         * Specifies the distance from the top of the container to the snap position on the child elements
         */
        public void scroll_padding_top(String value) {
            add("scroll-padding-top", value);
        }

        /**
         * Specifies where to position elements when the user stops scrolling
         */
        public void scroll_snap_align(String value) {
            add("scroll-snap-align", value);
        }

        /**
         * Specifies scroll behaviour after fast swipe on trackpad or touch screen
         */
        public void scroll_snap_stop(String value) {
            add("scroll-snap-stop", value);
        }

        /**
         * Specifies how snap behaviour should be when scrolling
         */
        public void scroll_snap_type(String value) {
            add("scroll-snap-type", value);
        }

        /**
         * Specifies the color of the scrollbar of an element
         */
        public void scrollbar_color(String value) {
            add("scrollbar-color", value);
        }

        /**
         * Specifies the width of a tab character
         */
        public void tab_size(String value) {
            add("tab-size", value);
        }

        /**
         * Defines the algorithm used to lay out table cells, rows, and columns
         */
        public void table_layout(String value) {
            add("table-layout", value);
        }

        /**
         * Specifies the horizontal alignment of text
         */
        public void text_align(String value) {
            add("text-align", value);
        }

        /**
         * Describes how the last line of a block or a line right before a forced line break is aligned when text-align is "justify"
         */
        public void text_align_last(String value) {
            add("text-align-last", value);
        }

        /**
         * Specifies the combination of multiple characters into the space of a single character
         */
        public void text_combine_upright(String value) {
            add("text-combine-upright", value);
        }

        /**
         * Specifies the decoration added to text
         */
        public void text_decoration(String value) {
            add("text-decoration", value);
        }

        /**
         * Specifies the color of the text-decoration
         */
        public void text_decoration_color(String value) {
            add("text-decoration-color", value);
        }

        /**
         * Specifies the type of line in a text-decoration
         */
        public void text_decoration_line(String value) {
            add("text-decoration-line", value);
        }

        /**
         * Specifies the style of the line in a text decoration
         */
        public void text_decoration_style(String value) {
            add("text-decoration-style", value);
        }

        /**
         * Specifies the thickness of the decoration line
         */
        public void text_decoration_thickness(String value) {
            add("text-decoration-thickness", value);
        }

        /**
         * A shorthand property for the text-emphasis-style and text-emphasis-color properties
         */
        public void text_emphasis(String value) {
            add("text-emphasis", value);
        }

        /**
         * Specifies the color of emphasis marks
         */
        public void text_emphasis_color(String value) {
            add("text-emphasis-color", value);
        }

        /**
         * Specifies the position of emphasis marks
         */
        public void text_emphasis_position(String value) {
            add("text-emphasis-position", value);
        }

        /**
         * Specifies the style of emphasis marks
         */
        public void text_emphasis_style(String value) {
            add("text-emphasis-style", value);
        }

        /**
         * Specifies the indentation of the first line in a text-block
         */
        public void text_indent(String value) {
            add("text-indent", value);
        }

        /**
         * Specifies the justification method used when text-align is "justify"
         */
        public void text_justify(String value) {
            add("text-justify", value);
        }

        /**
         * Defines the orientation of characters in a line
         */
        public void text_orientation(String value) {
            add("text-orientation", value);
        }

        /**
         * Specifies what should happen when text overflows the containing element
         */
        public void text_overflow(String value) {
            add("text-overflow", value);
        }

        /**
         * Adds shadow to text
         */
        public void text_shadow(String value) {
            add("text-shadow", value);
        }

        /**
         * Controls the capitalization of text
         */
        public void text_transform(String value) {
            add("text-transform", value);
        }

        /**
         * Specifies the offset distance of the underline text decoration
         */
        public void text_underline_offset(String value) {
            add("text-underline-offset", value);
        }

        /**
         * Specifies the position of the underline text decoration
         */
        public void text_underline_position(String value) {
            add("text-underline-position", value);
        }

        /**
         * Specifies the top position of a positioned element
         */
        public void top(String value) {
            add("top", value);
        }

        /**
         * Applies a 2D or 3D transformation to an element
         */
        public void transform(String value) {
            add("transform", value);
        }

        /**
         * Allows you to change the position on transformed elements
         */
        public void transform_origin(String value) {
            add("transform-origin", value);
        }

        /**
         * Specifies how nested elements are rendered in 3D space
         */
        public void transform_style(String value) {
            add("transform-style", value);
        }

        /**
         * A shorthand property for all the transition-* properties
         */
        public void transition(String value) {
            add("transition", value);
        }

        /**
         * Specifies when the transition effect will start
         */
        public void transition_delay(String value) {
            add("transition-delay", value);
        }

        /**
         * Specifies how many seconds or milliseconds a transition effect takes to complete
         */
        public void transition_duration(String value) {
            add("transition-duration", value);
        }

        /**
         * Specifies the name of the CSS property the transition effect is for
         */
        public void transition_property(String value) {
            add("transition-property", value);
        }

        /**
         * Specifies the speed curve of the transition effect
         */
        public void transition_timing_function(String value) {
            add("transition-timing-function", value);
        }

        /**
         * Specifies the position of an element
         */
        public void translate(String value) {
            add("translate", value);
        }

        /**
         * Used together with the direction property to set or return whether the text should be overridden to support multiple languages in the same document
         */
        public void unicode_bidi(String value) {
            add("unicode-bidi", value);
        }

        /**
         * Specifies whether the text of an element can be selected
         */
        public void user_select(String value) {
            add("user-select", value);
        }

        /**
         * Sets the vertical alignment of an element
         */
        public void vertical_align(String value) {
            add("vertical-align", value);
        }

        /**
         * Specifies whether or not an element is visible
         */
        public void visibility(String value) {
            add("visibility", value);
        }

        /**
         * Specifies how white-space inside an element is handled
         */
        public void white_space(String value) {
            add("white-space", value);
        }

        /**
         * Sets the minimum number of lines that must be left at the top of a page or column
         */
        public void widows(String value) {
            add("widows", value);
        }

        /**
         * Sets the width of an element
         */
        public void width(String value) {
            add("width", value);
        }

        /**
         * Specifies how words should break when reaching the end of a line
         */
        public void word_break(String value) {
            add("word-break", value);
        }

        /**
         * Increases or decreases the space between words in a text
         */
        public void word_spacing(String value) {
            add("word-spacing", value);
        }

        /**
         * Allows long, unbreakable words to be broken and wrap to the next line
         */
        public void word_wrap(String value) {
            add("word-wrap", value);
        }

        /**
         * Specifies whether lines of text are laid out horizontally or vertically
         */
        public void writing_mode(String value) {
            add("writing-mode", value);
        }

        /**
         * Sets the stack order of a positioned element
         */
        public void z_index(String value) {
            add("z-index", value);
        }
    }
}
