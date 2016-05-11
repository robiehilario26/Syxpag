package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(6);
    _jspx_dependants.add("/include/top.jsp");
    _jspx_dependants.add("/include/header.jsp");
    _jspx_dependants.add("/include/sidebar.jsp");
    _jspx_dependants.add("/body/_home.jsp");
    _jspx_dependants.add("/include/footer.jsp");
    _jspx_dependants.add("/include/buttom.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"Mosaddek\">\n");
      out.write("    <meta name=\"keyword\" content=\"FlatLab, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina\">\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/favicon.png\">\n");
      out.write("\n");
      out.write("    <title>Alimsaidbasher</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/bootstrap-reset.css\" rel=\"stylesheet\">\n");
      out.write("    <!--external css-->\n");
      out.write("    <link href=\"assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <link href=\"assets/advanced-datatable/media/css/demo_page.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"assets/advanced-datatable/media/css/demo_table.css\" rel=\"stylesheet\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/data-tables/DT_bootstrap.css\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/style-responsive.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"js/html5shiv.js\"></script>\n");
      out.write("      <script src=\"js/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("<section id=\"container\" class=\"\">\n");
      out.write("    ");
      out.write("<!--header start-->\n");
      out.write("      <header class=\"header white-bg\">\n");
      out.write("          <div class=\"sidebar-toggle-box\">\n");
      out.write("              <div data-original-title=\"Toggle Navigation\" data-placement=\"right\" class=\"fa fa-bars tooltips\"></div>\n");
      out.write("          </div>\n");
      out.write("          <!--logo start-->\n");
      out.write("          <a href=\"index.html\" class=\"logo\" ><span>Alimsaidbasher</span></a>\n");
      out.write("          <!--logo end-->\n");
      out.write("         \n");
      out.write("          <div class=\"top-nav \">\n");
      out.write("              <ul class=\"nav pull-right top-menu\">\n");
      out.write("                  <li>\n");
      out.write("                      <input type=\"text\" class=\"form-control search\" placeholder=\"Search\">\n");
      out.write("                  </li>\n");
      out.write("                  <!-- user login dropdown start-->\n");
      out.write("                  <li class=\"dropdown\">\n");
      out.write("                      <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">\n");
      out.write("                          <img alt=\"\" src=\"img/avatar1_small.jpg\">\n");
      out.write("                          <span class=\"username\">Jhon Doue</span>\n");
      out.write("                          <b class=\"caret\"></b>\n");
      out.write("                      </a>\n");
      out.write("                      <ul class=\"dropdown-menu extended logout\">\n");
      out.write("                          <div class=\"log-arrow-up\"></div>\n");
      out.write("                          <li><a href=\"#\"><i class=\" fa fa-suitcase\"></i>Profile</a></li>\n");
      out.write("                          <li><a href=\"#\"><i class=\"fa fa-cog\"></i> Settings</a></li>\n");
      out.write("                          <li><a href=\"#\"><i class=\"fa fa-bell-o\"></i> Notification</a></li>\n");
      out.write("                          <li><a href=\"login.html\"><i class=\"fa fa-key\"></i> Log Out</a></li>\n");
      out.write("                      </ul>\n");
      out.write("                  </li>\n");
      out.write("                  <!-- user login dropdown end -->\n");
      out.write("              </ul>\n");
      out.write("          </div>\n");
      out.write("      </header>\n");
      out.write("      <!--header end-->");
      out.write("\n");
      out.write("    ");
      out.write("<!--sidebar start-->\n");
      out.write("      <aside>\n");
      out.write("          <div id=\"sidebar\"  class=\"nav-collapse \">\n");
      out.write("              <!-- sidebar menu start-->\n");
      out.write("              <ul class=\"sidebar-menu\" id=\"nav-accordion\">\n");
      out.write("                  <li>\n");
      out.write("                      <a href=\"index.html\">\n");
      out.write("                          <i class=\"fa fa-dashboard\"></i>\n");
      out.write("                          <span>Dashboard</span>\n");
      out.write("                      </a>\n");
      out.write("                  </li>\n");
      out.write("\n");
      out.write("                  <li class=\"sub-menu\">\n");
      out.write("                      <a href=\"javascript:;\">\n");
      out.write("                          <i class=\"fa fa-laptop\"></i>\n");
      out.write("                          <span>Layouts</span>\n");
      out.write("                      </a>\n");
      out.write("                      <ul class=\"sub\">\n");
      out.write("                          <li><a  href=\"boxed_page.html\">Boxed Page</a></li>\n");
      out.write("                          <li><a  href=\"horizontal_menu.html\">Horizontal Menu</a></li>\n");
      out.write("                          <li><a  href=\"language_switch_bar.html\">Language Switch Bar</a></li>\n");
      out.write("                          <li><a  href=\"email_template.html\" target=\"_blank\">Email Template</a></li>\n");
      out.write("                      </ul>\n");
      out.write("                  </li>\n");
      out.write("\n");
      out.write("                  <li class=\"sub-menu\">\n");
      out.write("                      <a href=\"javascript:;\">\n");
      out.write("                          <i class=\"fa fa-book\"></i>\n");
      out.write("                          <span>UI Elements</span>\n");
      out.write("                      </a>\n");
      out.write("                      <ul class=\"sub\">\n");
      out.write("                          <li><a  href=\"general.html\">General</a></li>\n");
      out.write("                          <li><a  href=\"buttons.html\">Buttons</a></li>\n");
      out.write("                          <li><a  href=\"widget.html\">Widget</a></li>\n");
      out.write("                          <li><a  href=\"slider.html\">Slider</a></li>\n");
      out.write("                          <li><a  href=\"nestable.html\">Nestable</a></li>\n");
      out.write("                          <li><a  href=\"tree.html\">Tree View</a></li>\n");
      out.write("                          <li><a  href=\"font_awesome.html\">Font Awesome</a></li>\n");
      out.write("                      </ul>\n");
      out.write("                  </li>\n");
      out.write("\n");
      out.write("                  <li class=\"sub-menu\">\n");
      out.write("                      <a href=\"javascript:;\">\n");
      out.write("                          <i class=\"fa fa-cogs\"></i>\n");
      out.write("                          <span>Components</span>\n");
      out.write("                      </a>\n");
      out.write("                      <ul class=\"sub\">\n");
      out.write("                          <li><a  href=\"grids.html\">Grids</a></li>\n");
      out.write("                          <li><a  href=\"calendar.html\">Calendar</a></li>\n");
      out.write("                          <li><a  href=\"gallery.html\">Gallery</a></li>\n");
      out.write("                          <li><a  href=\"todo_list.html\">Todo List</a></li>\n");
      out.write("                          <li><a  href=\"draggable_portlet.html\">Draggable Portlet</a></li>\n");
      out.write("                      </ul>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"sub-menu\">\n");
      out.write("                      <a href=\"javascript:;\" >\n");
      out.write("                          <i class=\"fa fa-tasks\"></i>\n");
      out.write("                          <span>Form Stuff</span>\n");
      out.write("                      </a>\n");
      out.write("                      <ul class=\"sub\">\n");
      out.write("                          <li><a  href=\"form_component.html\">Form Components</a></li>\n");
      out.write("                          <li><a  href=\"advanced_form_components.html\">Advanced Components</a></li>\n");
      out.write("                          <li><a  href=\"form_wizard.html\">Form Wizard</a></li>\n");
      out.write("                          <li><a  href=\"form_validation.html\">Form Validation</a></li>\n");
      out.write("                          <li><a  href=\"dropzone.html\">Dropzone File Upload</a></li>\n");
      out.write("                          <li><a  href=\"inline_editor.html\">Inline Editor</a></li>\n");
      out.write("                          <li><a  href=\"image_cropping.html\">Image Cropping</a></li>\n");
      out.write("                          <li><a  href=\"file_upload.html\">Multiple File Upload</a></li>\n");
      out.write("                      </ul>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"sub-menu\">\n");
      out.write("                      <a href=\"javascript:;\" class=\"active\" >\n");
      out.write("                          <i class=\"fa fa-th\"></i>\n");
      out.write("                          <span>Data Tables</span>\n");
      out.write("                      </a>\n");
      out.write("                      <ul class=\"sub\">\n");
      out.write("                          <li><a  href=\"basic_table.html\">Basic Table</a></li>\n");
      out.write("                          <li ><a  href=\"responsive_table.html\">Responsive Table</a></li>\n");
      out.write("                          <li><a  href=\"dynamic_table.html\">Dynamic Table</a></li>\n");
      out.write("                          <li class=\"active\"><a  href=\"advanced_table.html\">Advanced Table</a></li>\n");
      out.write("                          <li><a  href=\"editable_table.html\">Editable Table</a></li>\n");
      out.write("                      </ul>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"sub-menu\">\n");
      out.write("                      <a href=\"javascript:;\" >\n");
      out.write("                          <i class=\" fa fa-envelope\"></i>\n");
      out.write("                          <span>Mail</span>\n");
      out.write("                      </a>\n");
      out.write("                      <ul class=\"sub\">\n");
      out.write("                          <li><a  href=\"inbox.html\">Inbox</a></li>\n");
      out.write("                          <li><a  href=\"inbox_details.html\">Inbox Details</a></li>\n");
      out.write("                      </ul>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"sub-menu\">\n");
      out.write("                      <a href=\"javascript:;\" >\n");
      out.write("                          <i class=\" fa fa-bar-chart-o\"></i>\n");
      out.write("                          <span>Charts</span>\n");
      out.write("                      </a>\n");
      out.write("                      <ul class=\"sub\">\n");
      out.write("                          <li><a  href=\"morris.html\">Morris</a></li>\n");
      out.write("                          <li><a  href=\"chartjs.html\">Chartjs</a></li>\n");
      out.write("                          <li><a  href=\"flot_chart.html\">Flot Charts</a></li>\n");
      out.write("                          <li><a  href=\"xchart.html\">xChart</a></li>\n");
      out.write("                      </ul>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"sub-menu\">\n");
      out.write("                      <a href=\"javascript:;\" >\n");
      out.write("                          <i class=\"fa fa-shopping-cart\"></i>\n");
      out.write("                          <span>Shop</span>\n");
      out.write("                      </a>\n");
      out.write("                      <ul class=\"sub\">\n");
      out.write("                          <li><a  href=\"product_list.html\">List View</a></li>\n");
      out.write("                          <li><a  href=\"product_details.html\">Details View</a></li>\n");
      out.write("                      </ul>\n");
      out.write("                  </li>\n");
      out.write("                  <li>\n");
      out.write("                      <a href=\"google_maps.html\" >\n");
      out.write("                          <i class=\"fa fa-map-marker\"></i>\n");
      out.write("                          <span>Google Maps </span>\n");
      out.write("                      </a>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"sub-menu\">\n");
      out.write("                      <a href=\"javascript:;\">\n");
      out.write("                          <i class=\"fa fa-comments-o\"></i>\n");
      out.write("                          <span>Chat Room</span>\n");
      out.write("                      </a>\n");
      out.write("                      <ul class=\"sub\">\n");
      out.write("                          <li><a  href=\"lobby.html\">Lobby</a></li>\n");
      out.write("                          <li><a  href=\"chat_room.html\"> Chat Room</a></li>\n");
      out.write("                      </ul>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"sub-menu\">\n");
      out.write("                      <a href=\"javascript:;\" >\n");
      out.write("                          <i class=\"fa fa-glass\"></i>\n");
      out.write("                          <span>Extra</span>\n");
      out.write("                      </a>\n");
      out.write("                      <ul class=\"sub\">\n");
      out.write("                          <li><a  href=\"blank.html\">Blank Page</a></li>\n");
      out.write("                          <li><a  href=\"lock_screen.html\">Lock Screen</a></li>\n");
      out.write("                          <li><a  href=\"profile.html\">Profile</a></li>\n");
      out.write("                          <li><a  href=\"invoice.html\">Invoice</a></li>\n");
      out.write("                          <li><a  href=\"search_result.html\">Search Result</a></li>\n");
      out.write("                          <li><a  href=\"pricing_table.html\">Pricing Table</a></li>\n");
      out.write("                          <li><a  href=\"faq.html\">FAQ</a></li>\n");
      out.write("                          <li><a  href=\"fb_wall.html\">FB Wall</a></li>\n");
      out.write("                          <li><a  href=\"404.html\">404 Error</a></li>\n");
      out.write("                          <li><a  href=\"500.html\">500 Error</a></li>\n");
      out.write("                      </ul>\n");
      out.write("                  </li>\n");
      out.write("                  <li>\n");
      out.write("                      <a  href=\"login.html\">\n");
      out.write("                          <i class=\"fa fa-user\"></i>\n");
      out.write("                          <span>Login Page</span>\n");
      out.write("                      </a>\n");
      out.write("                  </li>\n");
      out.write("\n");
      out.write("                  <!--multi level menu start-->\n");
      out.write("                  <li class=\"sub-menu\">\n");
      out.write("                      <a href=\"javascript:;\" >\n");
      out.write("                          <i class=\"fa fa-sitemap\"></i>\n");
      out.write("                          <span>Multi level Menu</span>\n");
      out.write("                      </a>\n");
      out.write("                      <ul class=\"sub\">\n");
      out.write("                          <li><a  href=\"javascript:;\">Menu Item 1</a></li>\n");
      out.write("                          <li class=\"sub-menu\">\n");
      out.write("                              <a  href=\"boxed_page.html\">Menu Item 2</a>\n");
      out.write("                              <ul class=\"sub\">\n");
      out.write("                                  <li><a  href=\"javascript:;\">Menu Item 2.1</a></li>\n");
      out.write("                                  <li class=\"sub-menu\">\n");
      out.write("                                      <a  href=\"javascript:;\">Menu Item 3</a>\n");
      out.write("                                      <ul class=\"sub\">\n");
      out.write("                                          <li><a  href=\"javascript:;\">Menu Item 3.1</a></li>\n");
      out.write("                                          <li><a  href=\"javascript:;\">Menu Item 3.2</a></li>\n");
      out.write("                                      </ul>\n");
      out.write("                                  </li>\n");
      out.write("                              </ul>\n");
      out.write("                          </li>\n");
      out.write("                      </ul>\n");
      out.write("                  </li>\n");
      out.write("                  <!--multi level menu end-->\n");
      out.write("\n");
      out.write("              </ul>\n");
      out.write("              <!-- sidebar menu end-->\n");
      out.write("          </div>\n");
      out.write("      </aside>\n");
      out.write("      <!--sidebar end-->");
      out.write("\n");
      out.write("    ");
      out.write("<!--main content start-->\n");
      out.write("<section id=\"main-content\">\n");
      out.write("    <section class=\"wrapper site-min-height\">\n");
      out.write("        <!-- page start-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div aria-hidden=\"true\" aria-labelledby=\"myModalLabel\" role=\"dialog\" tabindex=\"-1\" id=\"myModal-1\" class=\"modal fade\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button aria-hidden=\"true\" data-dismiss=\"modal\" class=\"close\" type=\"button\">×</button>\n");
      out.write("                        <h4 class=\"modal-title\">Create New</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                        <form class=\"form-horizontal\" role=\"form\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"homeTitle\" class=\"col-lg-2 col-sm-2 control-label\">Title</label>\n");
      out.write("                                <div class=\"col-lg-10\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"homeTitle\" placeholder=\"Title\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"homeArticle\" class=\"col-lg-2 col-sm-2 control-label\">Article</label>\n");
      out.write("                                <div class=\"col-lg-10\">\n");
      out.write("                                    <textarea type=\"text\" class=\"form-control\" id=\"homeArticle\" placeholder=\"Article\" rows=\"4\"></textarea>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"homeImage\" class=\"col-lg-2 col-sm-2 control-label\">Image</label>\n");
      out.write("                                <div class=\"col-lg-10\">\n");
      out.write("                                    <input type=\"file\" id=\"homeImage\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("<!--                            <button type=\"submit\" class=\"btn btn-primary\">Submit</button>-->\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer no-border\">\n");
      out.write("                        <!--                        <div class=\"btn-group\">\n");
      out.write("                                                    <button class=\"btn btn-primary\" type=\"submit\">\n");
      out.write("                                                        Save <i class=\"fa fa-check\"></i>\n");
      out.write("                                                    </button>\n");
      out.write("                                                </div>-->\n");
      out.write("                           <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <section class=\"panel\">\n");
      out.write("                    <header class=\"panel-heading\">\n");
      out.write("                        Home Setup\n");
      out.write("                    </header>\n");
      out.write("\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <div class=\"clearfix\">\n");
      out.write("                            <div class=\"btn-group\">\n");
      out.write("                                <button class=\"btn btn-primary\" data-target=\"#myModal-1\" data-toggle=\"modal\">\n");
      out.write("                                    Add New <i class=\"fa fa-plus\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"btn-group pull-right\">\n");
      out.write("                                <button class=\"btn dropdown-toggle\" data-toggle=\"dropdown\">Tools <i class=\"fa fa-angle-down\"></i>\n");
      out.write("                                </button>\n");
      out.write("                                <ul class=\"dropdown-menu pull-right\">\n");
      out.write("                                    <li><a href=\"#\">Print</a></li>\n");
      out.write("                                    <li><a href=\"#\">Save as PDF</a></li>\n");
      out.write("                                    <li><a href=\"#\">Export to Excel</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"space15\"></div>\n");
      out.write("                        <div class=\"adv-table\">\n");
      out.write("\n");
      out.write("                            <table  class=\"display table table-bordered table-striped\" id=\"example\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Record No</th>\n");
      out.write("                                        <th>Title</th>\n");
      out.write("                                        <th>Article</th>\n");
      out.write("                                        <th>Image</th>\n");
      out.write("                                        <th>Date Modified</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Trident</td>\n");
      out.write("                                        <td>Internet Explorer 4.0</td>\n");
      out.write("                                        <td>Win 95+</td>\n");
      out.write("                                        <td>4</td>\n");
      out.write("                                        <td>X</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Trident</td>\n");
      out.write("                                        <td>Internet Explorer 4.0</td>\n");
      out.write("                                        <td>Win 95+</td>\n");
      out.write("                                        <td>4</td>\n");
      out.write("                                        <td>X</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Trident</td>\n");
      out.write("                                        <td>Internet Explorer 4.0</td>\n");
      out.write("                                        <td>Win 95+</td>\n");
      out.write("                                        <td>4</td>\n");
      out.write("                                        <td>X</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                                <tfoot>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Record No</th>\n");
      out.write("                                        <th>Title</th>\n");
      out.write("                                        <th>Article</th>\n");
      out.write("                                        <th>Image</th>\n");
      out.write("                                        <th>Date Modified</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tfoot>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- page end-->\n");
      out.write("    </section>\n");
      out.write("</section>\n");
      out.write("<!--main content end-->");
      out.write("\n");
      out.write("    ");
      out.write("<!--footer start-->\n");
      out.write("<footer class=\"site-footer\">\n");
      out.write("    <div class=\"text-center\">\n");
      out.write("        2013 &copy; FlatLab by VectorLab.\n");
      out.write("        <a href=\"#\" class=\"go-top\">\n");
      out.write("            <i class=\"fa fa-angle-up\"></i>\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("<!--footer end-->");
      out.write("\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<!-- js placed at the end of the document so the pages load faster -->\n");
      out.write("<!--<script src=\"js/jquery.js\"></script>-->\n");
      out.write("<script type=\"text/javascript\" language=\"javascript\" src=\"assets/advanced-datatable/media/js/jquery.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script class=\"include\" type=\"text/javascript\" src=\"js/jquery.dcjqaccordion.2.7.js\"></script>\n");
      out.write("<script src=\"js/jquery.scrollTo.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.nicescroll.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/respond.min.js\" ></script>\n");
      out.write("<script type=\"text/javascript\" language=\"javascript\" src=\"assets/advanced-datatable/media/js/jquery.dataTables.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"assets/data-tables/DT_bootstrap.js\"></script>\n");
      out.write("\n");
      out.write("<!--common script for all pages-->\n");
      out.write("<script src=\"js/common-scripts.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--script for this page only-->\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("    $(document).ready(function() {\n");
      out.write("        $('#example').dataTable({\n");
      out.write("            \"aaSorting\": [[0, \"desc\"]]\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<!--script for this page-->\n");
      out.write("<script src=\"js/form-component.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
