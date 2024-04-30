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

    }

    @Override
    protected void buildStyle(StyleBuilder builder) {

    }
}
