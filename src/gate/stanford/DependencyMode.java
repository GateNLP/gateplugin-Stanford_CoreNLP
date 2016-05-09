/*
 * Copyright (c) 2006-2016, The University of Sheffield. See the file
 * COPYRIGHT.txt in the software or at http://gate.ac.uk/gate/COPYRIGHT.txt
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 * 
 * $Id: DependencyMode.java 15609 2012-03-21 11:00:31Z adamfunk $
 */
package gate.stanford;

import java.util.Collection;

import edu.stanford.nlp.trees.GrammaticalStructure;
import edu.stanford.nlp.trees.GrammaticalStructure.Extras;
import edu.stanford.nlp.trees.TypedDependency;

public enum DependencyMode {
  Typed,
  AllTyped,
  TypedCollapsed,
  TypedCCprocessed;
  
  
  protected static Collection<TypedDependency> getDependencies(GrammaticalStructure gs,
      DependencyMode mode, boolean includeExtras) {
    Collection<TypedDependency> result = null;
    
    Extras incl = Extras.NONE;
    if(includeExtras) {
      incl = Extras.MAXIMAL;
    }
    
    if (mode.equals(Typed)) {
      result = gs.typedDependencies(incl);
    }
    else if (mode.equals(AllTyped)) {
      result = gs.allTypedDependencies();
    }
    else if (mode.equals(TypedCollapsed)) {
      result = gs.typedDependenciesCollapsed(incl);
    }
    else if (mode.equals(TypedCCprocessed)) {
      result = gs.typedDependenciesCCprocessed(incl);
    }
    
    return result;
  }

}
