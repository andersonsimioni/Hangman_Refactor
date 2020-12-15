format 222

classinstance 128002 class_ref 128123 // Player
  name ""   xyz 36 5 2000 life_line_z 2000
classinstance 128130 class_ref 128251 // Game
  name ""   xyz 134 6 2000 life_line_z 2000
classinstance 128258 class_ref 128379 // FileIO
  name ""   xyz 446 5 2000 life_line_z 2000
classinstance 128386 class_ref 128507 // WorldList
  name ""   xyz 220 10 2000 life_line_z 2000
classinstance 128514 class_ref 128635 // SecretWord
  name ""   xyz 328 4 2000 life_line_z 2000
durationcanvas 128642 classinstance_ref 128002 // :Player
  xyzwh 48 69 2010 11 40
end
durationcanvas 128770 classinstance_ref 128130 // :Game
  xyzwh 153 69 2010 11 57
end
durationcanvas 129275 classinstance_ref 128002 // :Player
  xyzwh 48 226 2010 11 119
  overlappingdurationcanvas 130555
    xyzwh 54 298 2020 11 25
  end
end
durationcanvas 129410 classinstance_ref 128386 // :WorldList
  xyzwh 240 81 2010 11 175
  overlappingdurationcanvas 130178
    xyzwh 246 130 2020 11 62
  end
  overlappingdurationcanvas 130946
    xyzwh 246 204 2020 11 36
  end
end
durationcanvas 129787 classinstance_ref 128514 // :SecretWord
  xyzwh 358 273 2010 11 29
end
durationcanvas 129922 classinstance_ref 128258 // :FileIO
  xyzwh 465 91 2010 11 65
end
durationcanvas 130434 classinstance_ref 128514 // :SecretWord
  xyzwh 358 180 2010 11 53
end
durationcanvas 131202 classinstance_ref 128130 // :Game
  xyzwh 153 211 2010 11 139
  overlappingdurationcanvas 129531
    xyzwh 159 267 2020 11 55
    overlappingdurationcanvas 130043
      xyzwh 165 291 2030 11 25
    end
  end
end
durationcanvas 132098 classinstance_ref 128002 // :Player
  xyzwh 48 439 2010 11 79
  overlappingdurationcanvas 132482
    xyzwh 54 458 2020 11 55
  end
end
durationcanvas 132226 classinstance_ref 128130 // :Game
  xyzwh 153 459 2010 11 54
end
msg 128898 synchronous
  from durationcanvas_ref 128642
  to durationcanvas_ref 128770
  yz 69 2015 explicitmsg "newGame"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 76 56
msg 129403 synchronous
  from durationcanvas_ref 131202
  to durationcanvas_ref 129275
  yz 233 2015 explicitmsg "start game"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 78 217
msg 129538 synchronous
  from durationcanvas_ref 128770
  to durationcanvas_ref 129410
  yz 81 2015 explicitmsg "get Wordlist"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 174 68
msg 129659 synchronous
  from durationcanvas_ref 129275
  to durationcanvas_ref 129531
  yz 267 2025 explicitmsg "play letter"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 84 251
msg 129915 synchronous
  from durationcanvas_ref 129531
  to durationcanvas_ref 129787
  yz 275 2030 explicitmsg "try letter"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 274 259
msg 130050 synchronous
  from durationcanvas_ref 129410
  to durationcanvas_ref 129922
  yz 91 2020 explicitmsg "read wordlist file"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 351 76
msg 130171 synchronous
  from durationcanvas_ref 129787
  to durationcanvas_ref 130043
  yz 291 2035 explicitmsg "play result"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 277 298
msg 130306 synchronous
  from durationcanvas_ref 129922
  to durationcanvas_ref 130178
  yz 130 2025 explicitmsg "words"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 360 117
msg 130562 synchronous
  from durationcanvas_ref 130178
  to durationcanvas_ref 130434
  yz 181 2025 explicitmsg "get Secret Word"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 270 165
msg 130683 synchronous
  from durationcanvas_ref 130043
  to durationcanvas_ref 130555
  yz 298 2035 explicitmsg "render game"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 82 282
msg 131074 synchronous
  from durationcanvas_ref 130434
  to durationcanvas_ref 130946
  yz 211 2025 explicitmsg "secretWord"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 279 198
msg 131330 synchronous
  from durationcanvas_ref 130946
  to durationcanvas_ref 131202
  yz 213 2025 explicitmsg "secret word"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 176 200
msg 132354 synchronous
  from durationcanvas_ref 132098
  to durationcanvas_ref 132226
  yz 483 2015 explicitmsg "end Game"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 80 470
msg 132610 synchronous
  from durationcanvas_ref 132226
  to durationcanvas_ref 132482
  yz 502 2025 explicitmsg "player Score"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 78 489
end
