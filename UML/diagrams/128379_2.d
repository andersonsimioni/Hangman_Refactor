format 222

classcanvas 128123 class_ref 128123 // Player
  classdiagramsettings member_max_width 0 end
  xyz 26 68 2000
end
classcanvas 128251 class_ref 128251 // Game
  classdiagramsettings member_max_width 0 end
  xyz 179 6 2000
end
classcanvas 128379 class_ref 128379 // FileIO
  classdiagramsettings member_max_width 0 end
  xyz 578 218 2000
end
classcanvas 128507 class_ref 128507 // WorldList
  classdiagramsettings member_max_width 0 end
  xyz 590 42 2000
end
classcanvas 128763 class_ref 128635 // SecretWord
  classdiagramsettings member_max_width 0 end
  xyz 389 30 2000
end
relationcanvas 128635 relation_ref 128123 // <association>
  from ref 128507 z 2001 to ref 128379
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 128770 relation_ref 128258 // <directional composition>
  from ref 128123 z 2001 to ref 128251
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 129019 relation_ref 134779 // <association>
  from ref 128507 z 2001 to ref 128763
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 129026 relation_ref 128386 // <directional composition>
  from ref 128763 z 2001 to ref 128251
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
end
