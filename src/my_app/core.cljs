(ns my_app.core

)

(def ctx (-> js/document
             (.getElementById "canvas")
             (.getContext "2d")))

(defn draw-shape [x y radius color]
  (set! (.-fillStyle ctx) color)
  (.beginPath ctx)
  (.arc ctx x y radius 0 (* 2 Math/PI))
  (.fill ctx))
  
;;(defn showProp [prop]
;;	( println  (str prop ":" (System/getProperty prop))))
  
;; (System/getProperty prop1) 
   
(comment  .setColor Color/GREEN )
(draw-shape 150 150 100 "blue")
;;(comment 'println showProp propf' )
(draw-shape 200 200 100 "black")
(draw-shape 250 250 100 "green")

(doseq [j (range 90 250 60)] (draw-shape j j  60 "red"))
(js/alert "I am an evil side-effectand some long text to reveal other message")
