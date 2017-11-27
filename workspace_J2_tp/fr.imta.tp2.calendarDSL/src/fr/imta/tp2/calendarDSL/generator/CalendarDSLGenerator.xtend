/*
 * generated by Xtext
 */
package fr.imta.tp2.calendarDSL.generator

import fr.imta.tp2.calendarDSL.calendarDSL.Calendar
import fr.imta.tp2.calendarDSL.calendarDSL.Event
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class CalendarDSLGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (c : resource.allContents.toIterable.filter(Calendar)) {
			fsa.generateFile(
            	"Main" + ".java",
            	c.compile)
		}
	}
	
	def compile(Calendar c) ''' 
        import calendar.Calendar;
        import calendar.Event;
        public class Main {
        	public static void main(String[] args) {
        		Calendar calendar = new Calendar();
        		«FOR e : c.events»
	                «e.compile(c.events.indexOf(e))»
	            «ENDFOR»
        	}
        }
    '''
 
    def compile(Event e, int i) '''
        Event event«i» = new Event();
        event«i».setName("«e.name»");
        event«i».setDate(«e.on.year»,«e.on.month»,«e.on.day»);
        event«i».setStartTime("«e.from»");
        event«i».setEndTime("«e.to»");
        event«i».setLocation("«e.at»");
        calendar.addEvent(event«i»);
        
    '''
}