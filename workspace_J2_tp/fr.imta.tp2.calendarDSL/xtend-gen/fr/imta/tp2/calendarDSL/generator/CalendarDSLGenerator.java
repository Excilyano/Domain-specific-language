/**
 * generated by Xtext
 */
package fr.imta.tp2.calendarDSL.generator;

import com.google.common.collect.Iterables;
import fr.imta.tp2.calendarDSL.calendarDSL.Calendar;
import fr.imta.tp2.calendarDSL.calendarDSL.Date;
import fr.imta.tp2.calendarDSL.calendarDSL.Event;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class CalendarDSLGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Calendar> _filter = Iterables.<Calendar>filter(_iterable, Calendar.class);
    for (final Calendar c : _filter) {
      String _plus = ("Main" + ".java");
      CharSequence _compile = this.compile(c);
      fsa.generateFile(_plus, _compile);
    }
  }
  
  public CharSequence compile(final Calendar c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import calendar.Calendar;");
    _builder.newLine();
    _builder.append("import calendar.Event;");
    _builder.newLine();
    _builder.append("public class Main {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Calendar calendar = new Calendar();");
    _builder.newLine();
    {
      EList<Event> _events = c.getEvents();
      for(final Event e : _events) {
        EList<Event> _events_1 = c.getEvents();
        int _indexOf = _events_1.indexOf(e);
        CharSequence _compile = this.compile(e, _indexOf);
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Event e, final int i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Event event");
    _builder.append(i, "");
    _builder.append(" = new Event();");
    _builder.newLineIfNotEmpty();
    _builder.append("event");
    _builder.append(i, "");
    _builder.append(".setName(\"");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("event");
    _builder.append(i, "");
    _builder.append(".setDate(");
    Date _on = e.getOn();
    String _year = _on.getYear();
    _builder.append(_year, "");
    _builder.append(",");
    Date _on_1 = e.getOn();
    String _month = _on_1.getMonth();
    _builder.append(_month, "");
    _builder.append(",");
    Date _on_2 = e.getOn();
    String _day = _on_2.getDay();
    _builder.append(_day, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("event");
    _builder.append(i, "");
    _builder.append(".setStartTime(\"");
    String _from = e.getFrom();
    _builder.append(_from, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("event");
    _builder.append(i, "");
    _builder.append(".setEndTime(\"");
    String _to = e.getTo();
    _builder.append(_to, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("event");
    _builder.append(i, "");
    _builder.append(".setLocation(\"");
    String _at = e.getAt();
    _builder.append(_at, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("calendar.addEvent(event");
    _builder.append(i, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
}
