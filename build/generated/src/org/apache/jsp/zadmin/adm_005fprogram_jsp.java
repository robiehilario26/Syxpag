package org.apache.jsp.zadmin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adm_005fprogram_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(6);
    _jspx_dependants.add("/include/top.jsp");
    _jspx_dependants.add("/include/header.jsp");
    _jspx_dependants.add("/include/navigator/navProgram.jsp");
    _jspx_dependants.add("/body/_program.jsp");
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"Mosaddek\">\r\n");
      out.write("        <meta name=\"keyword\" content=\"FlatLab, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina\">\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/favicon.png\">\r\n");
      out.write("\r\n");
      out.write("        <title>Alimsaidbasher</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap core CSS -->\r\n");
      out.write("        <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../css/bootstrap-reset.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!--external css-->\r\n");
      out.write("        <link href=\"../assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<!--        <link href=\"assets/advanced-datatable/media/css/demo_page.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"assets/advanced-datatable/media/css/demo_table.css\" rel=\"stylesheet\" />-->\r\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"assets/data-tables/DT_bootstrap.css\" />-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom styles for this template -->\r\n");
      out.write("        <link href=\"../css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../css/style-responsive.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("          <script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("          <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"../assets/advanced-datatable/media/js/jquery.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script class=\"include\" type=\"text/javascript\" src=\"../js/jquery.dcjqaccordion.2.7.js\"></script>\r\n");
      out.write("        <script src=\"../js/jquery.scrollTo.min.js\"></script>\r\n");
      out.write("        <script src=\"../js/jquery.nicescroll.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"../js/respond.min.js\" ></script>\r\n");
      out.write("        <!--        <script type=\"text/javascript\" language=\"javascript\" src=\"assets/advanced-datatable/media/js/jquery.dataTables.js\"></script>\r\n");
      out.write("                <script type=\"text/javascript\" src=\"assets/data-tables/DT_bootstrap.js\"></script>-->\r\n");
      out.write("\r\n");
      out.write("        <!--common script for all pages-->\r\n");
      out.write("        <script src=\"../js/common-scripts.js\"></script>\r\n");
      out.write("        <link href=\"../datatables/dataTables.bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <script src=\"../js/jquery-1.11.1.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"../datatables/jquery.dataTables.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"../datatables/dataTables.bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("<section id=\"container\" class=\"\">\r\n");
      out.write("    ");
      out.write("<!--header start-->\r\n");
      out.write("      <header class=\"header white-bg\">\r\n");
      out.write("          <div class=\"sidebar-toggle-box\">\r\n");
      out.write("              <div data-original-title=\"Toggle Navigation\" data-placement=\"right\" class=\"fa fa-bars tooltips\"></div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!--logo start-->\r\n");
      out.write("          <a href=\"index.html\" class=\"logo\" ><span>Alimsaidbasher</span></a>\r\n");
      out.write("          <!--logo end-->\r\n");
      out.write("         \r\n");
      out.write("          <div class=\"top-nav \">\r\n");
      out.write("              <ul class=\"nav pull-right top-menu\">\r\n");
      out.write("                  <li>\r\n");
      out.write("                      <input type=\"text\" class=\"form-control search\" placeholder=\"Search\">\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <!-- user login dropdown start-->\r\n");
      out.write("                  <li class=\"dropdown\">\r\n");
      out.write("                      <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">\r\n");
      out.write("                          <img alt=\"\" src=\"../img/avatar1_small.jpg\">\r\n");
      out.write("                          <span class=\"username\">Jhon Doue</span>\r\n");
      out.write("                          <b class=\"caret\"></b>\r\n");
      out.write("                      </a>\r\n");
      out.write("                      <ul class=\"dropdown-menu extended logout\">\r\n");
      out.write("                          <div class=\"log-arrow-up\"></div>\r\n");
      out.write("                          <li><a href=\"#\"><i class=\" fa fa-suitcase\"></i>Profile</a></li>\r\n");
      out.write("                          <li><a href=\"#\"><i class=\"fa fa-cog\"></i> Settings</a></li>\r\n");
      out.write("                          <li><a href=\"#\"><i class=\"fa fa-bell-o\"></i> Notification</a></li>\r\n");
      out.write("                          <li><a href=\"login.html\"><i class=\"fa fa-key\"></i> Log Out</a></li>\r\n");
      out.write("                      </ul>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <!-- user login dropdown end -->\r\n");
      out.write("              </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("      </header>\r\n");
      out.write("      <!--header end-->");
      out.write("\r\n");
      out.write("    ");
      out.write("<!--sidebar start-->\n");
      out.write("<aside>\n");
      out.write("    <div id=\"sidebar\"  class=\"nav-collapse \">\n");
      out.write("        <!-- sidebar menu start-->\n");
      out.write("        <ul class=\"sidebar-menu\" id=\"nav-accordion\">\n");
      out.write("            <li>\n");
      out.write("                <a href=\"adm_home.jsp\">\n");
      out.write("                    <i class=\"fa fa-home\"></i>\n");
      out.write("                    <span>Home</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"adm_about.jsp\">\n");
      out.write("                    <i class=\"fa fa-info-circle\"></i>\n");
      out.write("                    <span>About</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"adm_team.jsp\">\n");
      out.write("                    <i class=\"fa fa-users\"></i>\n");
      out.write("                    <span>Team</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"adm_gallery.jsp\">\n");
      out.write("                    <i class=\"fa fa-film\"></i>\n");
      out.write("                    <span>Galery</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"adm_services.jsp\">\n");
      out.write("                    <i class=\"fa fa-tasks\"></i>\n");
      out.write("                    <span>Services</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a  href=\"adm_contact.jsp\">\n");
      out.write("                    <i class=\"fa fa-phone\"></i>\n");
      out.write("                    <span>Contact</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a class=\"active\" href=\"adm_program.jsp\">\n");
      out.write("                    <i class=\"fa fa-desktop\"></i>\n");
      out.write("                    <span>Program</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a  href=\"adm_blog.jsp\">\n");
      out.write("                    <i class=\"fa fa-trophy\"></i>\n");
      out.write("                    <span>Blog</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a  href=\"adm_files.jsp\">\n");
      out.write("                    <i class=\"fa fa-folder-open\"></i>\n");
      out.write("                    <span>Files</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a  href=\"adm_acknowledgment.jsp\">\n");
      out.write("                    <i class=\"fa fa-book\"></i>\n");
      out.write("                    <span>Acknowledgement</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a  href=\"adm_about_link.jsp\">\n");
      out.write("                    <i class=\"fa fa-video-camera\"></i>\n");
      out.write("                    <span>About Links</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"adm_users.jsp\">\n");
      out.write("                    <i class=\"fa fa-user\"></i>\n");
      out.write("                    <span>Users</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</aside>\n");
      out.write("<!--sidebar end-->\n");
      out.write("\n");
      out.write("\r\n");
      out.write("    ");
      out.write("<!--main content start-->\r\n");
      out.write("<section id=\"main-content\">\r\n");
      out.write("    <section class=\"wrapper site-min-height\">\r\n");
      out.write("        <!-- page start-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div aria-hidden=\"true\" aria-labelledby=\"myModalLabel\" role=\"dialog\" tabindex=\"-1\" id=\"myModal-1\" class=\"modal fade\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <button aria-hidden=\"true\" data-dismiss=\"modal\" id=\"closeModalButton\" class=\"close\" type=\"button\">×</button>\r\n");
      out.write("                        <h4 class=\"modal-title\">Create New</h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                        <form class=\"form-horizontal\" role=\"form\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"aboutTitle\" class=\"col-lg-2 col-sm-2 control-label\">Title</label>\r\n");
      out.write("                                <div class=\"col-lg-10\">\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"programTitle\" placeholder=\"Title\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"aboutArticle\" class=\"col-lg-2 col-sm-2 control-label\">Article</label>\r\n");
      out.write("                                <div class=\"col-lg-10\">\r\n");
      out.write("                                    <textarea type=\"text\" class=\"form-control\" id=\"programArticle\" placeholder=\"Article\" rows=\"4\"></textarea>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer no-border\">\r\n");
      out.write("                        <button type=\"submit\" onclick=\"save_edit_about_content()\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-lg-12\">\r\n");
      out.write("                <section class=\"panel\">\r\n");
      out.write("                    <header class=\"panel-heading\">\r\n");
      out.write("                        About\r\n");
      out.write("                    </header>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"panel-body\">\r\n");
      out.write("                        <div class=\"clearfix\">\r\n");
      out.write("                            <div class=\"btn-group\">\r\n");
      out.write("                                <button class=\"btn btn-primary\" data-target=\"#myModal-1\" onclick=\"clear_the_form()\" data-toggle=\"modal\">\r\n");
      out.write("                                    Add New <i class=\"fa fa-plus\"></i>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"space15\"></div>\r\n");
      out.write("                        <div class=\"adv-table\">\r\n");
      out.write("\r\n");
      out.write("                            <table  class=\"display table table-bordered table-striped\" id=\"example1\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th>Record No</th>\r\n");
      out.write("                                        <th>Title</th>\r\n");
      out.write("                                        <th>Article</th>\r\n");
      out.write("                                        <th>Date Modified</th>\r\n");
      out.write("                                        <th style=\"width: 138px\">Action</th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td>Trident</td>\r\n");
      out.write("                                        <td>Win 95+</td>\r\n");
      out.write("                                        <td>4</td>\r\n");
      out.write("                                        <td>X</td>\r\n");
      out.write("                                        <td>\r\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-info btn-sm\">Edit</button>\r\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-danger btn-sm\">Delete</button>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                                <tfoot>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th>Record No</th>\r\n");
      out.write("                                        <th>Title</th>\r\n");
      out.write("                                        <th>Article</th>\r\n");
      out.write("                                        <th>Date Modified</th>\r\n");
      out.write("                                        <th>Action</th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </tfoot>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </section>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- page end-->\r\n");
      out.write("    </section>\r\n");
      out.write("</section>\r\n");
      out.write("<!--main content end-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("    function clear_the_form() {\r\n");
      out.write("\r\n");
      out.write("        $('#programTitle').val(\"\");\r\n");
      out.write("        $('#programArticle').val(\"\");\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    function save() {\r\n");
      out.write("\r\n");
      out.write("        alert(\"where are you from here\");\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    var global_update_id;\r\n");
      out.write("    var action = \"add\";\r\n");
      out.write("    function save_edit_about_content() {\r\n");
      out.write("\r\n");
      out.write("        var title = $('#programTitle').val();\r\n");
      out.write("        var article = $('#programArticle').val();\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type: \"post\", // GET or POST\r\n");
      out.write("            url: 'Controller_Program', // Path to file\r\n");
      out.write("\r\n");
      out.write("            data: {\r\n");
      out.write("                \"title\": title,\r\n");
      out.write("                \"article\": article,\r\n");
      out.write("                \"action\": action,\r\n");
      out.write("                \"id\": global_update_id\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            },\r\n");
      out.write("            beforeSend: function () {\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            },\r\n");
      out.write("            complete: function () {\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            },\r\n");
      out.write("            success: function (response) {\r\n");
      out.write("\r\n");
      out.write("                document.getElementById('closeModalButton').click();\r\n");
      out.write("\r\n");
      out.write("                load_data();\r\n");
      out.write("                action = \"add\";\r\n");
      out.write("                clear_the_form();\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            },\r\n");
      out.write("            error: function (xhr) {\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("        $('#example1').dataTable({\r\n");
      out.write("            \"bPaginate\": true,\r\n");
      out.write("            \"bLengthChange\": true,\r\n");
      out.write("            \"bFilter\": true,\r\n");
      out.write("            \"bSort\": true,\r\n");
      out.write("            \"bInfo\": true,\r\n");
      out.write("            \"bAutoWidth\": false,\r\n");
      out.write("            \"order\": [[ 0, \"desc\" ]],\r\n");
      out.write("            // \"serverSide\": true,\r\n");
      out.write("            // \"ajax\": \"LoadEmpOverTime\",\r\n");
      out.write("            \"columnDefs\": [\r\n");
      out.write("                {\r\n");
      out.write("                    //used to force the datable to accept null value\r\n");
      out.write("                    //the default content will be null\r\n");
      out.write("                    \"targets\": [0, 1, 2, 3, 4],\r\n");
      out.write("                    \"defaultContent\": \"\"\r\n");
      out.write("                }\r\n");
      out.write("            ]\r\n");
      out.write("                    // \"deferLoading\": 57\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function update_elem(elem) {\r\n");
      out.write("\r\n");
      out.write("        var id = $(elem).attr(\"id\");\r\n");
      out.write("        action = \"edit\";\r\n");
      out.write("        var record = ($('#' + id + '').parent().siblings().eq(0).text());\r\n");
      out.write("        var title = ($('#' + id + '').parent().siblings().eq(1).text());\r\n");
      out.write("        var article = ($('#' + id + '').parent().siblings().eq(2).text());\r\n");
      out.write("\r\n");
      out.write("        global_update_id = record;\r\n");
      out.write("        console.log(global_update_id);\r\n");
      out.write("\r\n");
      out.write("        $('#programTitle').val(title);\r\n");
      out.write("        $('#programArticle').val(article);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    function delete_about(elem) {\r\n");
      out.write("\r\n");
      out.write("        alert(\"deleting the content\");\r\n");
      out.write("\r\n");
      out.write("        var id = $(elem).attr(\"id\");\r\n");
      out.write("        var record = ($('#' + id + '').parent().siblings().eq(0).text());\r\n");
      out.write("\r\n");
      out.write("        action = \"delete\";\r\n");
      out.write("        global_update_id = record;\r\n");
      out.write("\r\n");
      out.write("        save_edit_about_content();\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    function load_data() {\r\n");
      out.write("        console.log(\"success load load_data\");\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type: \"get\", // GET or POST\r\n");
      out.write("            url: 'Data_table_Program', // Path to file\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            beforeSend: function () {                                // Before Ajax \r\n");
      out.write("\r\n");
      out.write("            },\r\n");
      out.write("            complete: function () {\r\n");
      out.write("\r\n");
      out.write("                //$success.show();\r\n");
      out.write("            },\r\n");
      out.write("            success: function (response) {\r\n");
      out.write("// Show content\r\n");
      out.write("//                alert(response.toString());\r\n");
      out.write("                $('#example1').DataTable().clear().draw();\r\n");
      out.write("                var counting = 0;\r\n");
      out.write("\r\n");
      out.write("                $.each(response, function (index, value) {\r\n");
      out.write("                    counting++;\r\n");
      out.write("\r\n");
      out.write("                    var button = ' <button type=\"button\"  id=\"my_update' + counting + '\" onclick=\"update_elem(this)\" class=\"btn btn-info btn-sm\" data-target=\"#myModal-1\" data-toggle=\"modal\">Edit</button> '\r\n");
      out.write("                            + ' <button type=\"button\"   id=\"my_delete' + counting + '\" onclick=\" delete_about(this)\" class=\"btn btn-danger btn-sm\">Delete</button>';\r\n");
      out.write("\r\n");
      out.write("                    $('#example1').DataTable().row.add([\r\n");
      out.write("                        value.id,\r\n");
      out.write("                        value.title,\r\n");
      out.write("                        value.article,\r\n");
      out.write("                        value.date_modified,\r\n");
      out.write("                        button\r\n");
      out.write("\r\n");
      out.write("                    ]).draw();\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                });\r\n");
      out.write("            },\r\n");
      out.write("            error: function (xhr) {\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("\r\n");
      out.write("        load_data();\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("    ");
      out.write("<!--footer start-->\r\n");
      out.write("<footer class=\"site-footer\">\r\n");
      out.write("    <div class=\"text-center\">\r\n");
      out.write("        2013 &copy; FlatLab by VectorLab.\r\n");
      out.write("        <a href=\"#\" class=\"go-top\">\r\n");
      out.write("            <i class=\"fa fa-angle-up\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("<!--footer end-->");
      out.write("\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<!-- js placed at the end of the document so the pages load faster -->\r\n");
      out.write("<!--<script src=\"js/jquery.js\"></script>-->\r\n");
      out.write("<!--<script type=\"text/javascript\" language=\"javascript\" src=\"assets/advanced-datatable/media/js/jquery.js\"></script>-->\r\n");
      out.write("<script src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("<script class=\"include\" type=\"text/javascript\" src=\"../js/jquery.dcjqaccordion.2.7.js\"></script>\r\n");
      out.write("<script src=\"../js/jquery.scrollTo.min.js\"></script>\r\n");
      out.write("<script src=\"../js/jquery.nicescroll.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../js/respond.min.js\" ></script>\r\n");
      out.write("<!--<script type=\"text/javascript\" language=\"javascript\" src=\"assets/advanced-datatable/media/js/jquery.dataTables.js\"></script>-->\r\n");
      out.write("<!--<script type=\"text/javascript\" src=\"assets/data-tables/DT_bootstrap.js\"></script>-->\r\n");
      out.write("\r\n");
      out.write("<!--common script for all pages-->\r\n");
      out.write("<script src=\"../js/common-scripts.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--script for this page only-->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("        $('#example').dataTable({\r\n");
      out.write("            \"aaSorting\": [[0, \"desc\"]]\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<!--script for this page-->\r\n");
      out.write("<script src=\"../js/form-component.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write('\r');
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