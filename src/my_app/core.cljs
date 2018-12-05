(ns my_app.core)

(def ctx (-> js/document
             (.getElementById "canvas")
             (.getContext "2d")))

(defn draw-shape [x y radius color]
  (set! (.-fillStyle ctx) color)
  (.beginPath ctx)
  (.arc ctx x y radius 0 (* 2 Math/PI))
  (.fill ctx))

(draw-shape 150 150 100 "blue")
