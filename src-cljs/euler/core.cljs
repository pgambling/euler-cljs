(ns euler.core)

(enable-console-print!)

(defn init []
  (println (euler.five/run)))

(set! (.-onload js/window) init)
