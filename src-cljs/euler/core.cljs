(ns euler.core)

(enable-console-print!)

(defn init []
  (println (euler.three/run)))

(set! (.-onload js/window) init)
