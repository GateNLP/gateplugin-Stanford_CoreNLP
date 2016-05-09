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
 */

package gate.stanford.apps;

import gate.creole.PackagedController;
import gate.creole.metadata.AutoInstance;
import gate.creole.metadata.CreoleParameter;
import gate.creole.metadata.CreoleResource;

import java.net.URL;
import java.util.List;

@CreoleResource(name="English Dependency Parser",
    comment = "Ready-made application for Stanford English parser",
    autoinstances = @AutoInstance)
public class EnglishDependencies extends PackagedController {

  private static final long serialVersionUID = 3163023140886167369L;

  @Override
  @CreoleParameter(defaultValue="sample_parser_en.gapp")
  public void setPipelineURL(URL url) {
    this.url = url;    
  }
  
  @Override
  @CreoleParameter(defaultValue="Stanford Parser")
  public void setMenu(List<String> menu) {
    super.setMenu(menu);
  }
}
